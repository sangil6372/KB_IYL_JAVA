package todo.service;

import todo.command.AddTaskCommand;
import todo.command.Command;
import todo.command.CommandInvoker;
import todo.command.DeleteTaskCommand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskManager taskManager = new TaskManager(); // 할 일 관리 클래스
    private static final CommandInvoker commandInvoker = new CommandInvoker(); // 명령어 실행 및 undo 관리

    // 명령어 패턴과 실행 로직을 매핑하는 Map
    private static final Map<Pattern, Consumer<String>> commandHandlers = new HashMap<>();

    // static 블록을 통해 명령어와 처리 함수 등록
    static {
        // 프로그램 종료 명령
        commandHandlers.put(Pattern.compile("^exit$"), (input) -> {
            System.out.println("Goodbye!");
            System.exit(0);
        });

        // 할 일 목록 출력 명령
        commandHandlers.put(Pattern.compile("^todo list$"), (input) -> {
            taskManager.listTasks(); // 오타 수정된 메서드
        });

        // 마지막 명령 취소 (Undo)
        commandHandlers.put(Pattern.compile("^todo undo$"), (input) -> {
            commandInvoker.undoLastCommand();
        });

        // 할 일 추가 명령: todo add <우선순위> <내용>
        commandHandlers.put(Pattern.compile("^todo add (\\d+) (.+)$"), (input) -> {
            try {
                String[] tokens = input.split(" ", 3);
                int priority = Integer.parseInt(tokens[2].split(" ")[0]); // 우선순위
                String content = tokens[2].substring(tokens[2].indexOf(" ") + 1); // 내용

                if (priority < 1 || priority > 5) {
                    System.out.println("우선순위는 1부터 5 사이의 숫자여야 합니다.");
                    return;
                }

                Command addCommand = new AddTaskCommand(taskManager, priority, content);
                commandInvoker.executeCommand(addCommand);
            } catch (Exception e) {
                System.out.println("할 일 추가 실패: " + e.getMessage());
            }
        });

        // 할 일 삭제 명령: todo del <번호>
        commandHandlers.put(Pattern.compile("^todo del (\\d+)$"), (input) -> {
            try {
                String[] tokens = input.split(" ");
                int index = Integer.parseInt(tokens[2]) - 1;
                List<Task> taskList = taskManager.getTasksAsList();

                if (index < 0 || index >= taskList.size()) {
                    System.out.println("존재하지 않는 번호입니다.");
                    return;
                }

                Task task = taskList.get(index);
                Command deleteCommand = new DeleteTaskCommand(taskManager, task, index);
                commandInvoker.executeCommand(deleteCommand);
            } catch (NumberFormatException e) {
                System.out.println("❌ 번호는 숫자여야 합니다.");
            } catch (Exception e) {
                System.out.println("삭제 실패: " + e.getMessage());
            }
        });

    }

    public static void main(String[] args) {
        System.out.println("📝 TO-DO 프로그램을 시작합니다. 명령어를 입력하세요.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            boolean matched = false;
            for (Map.Entry<Pattern, Consumer<String>> entry : commandHandlers.entrySet()) {
                if (entry.getKey().matcher(input).matches()) {
                    entry.getValue().accept(input);
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                System.out.println("알 수 없는 명령어입니다. 예시: todo add 1 공부하기");
            }
        }
    }
}
