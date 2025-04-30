package todo.command;

import java.util.Stack;

/**
 * CommandInvoker는 명령을 실행하고 undo 기능을 제공하는 클래스입니다.
 * 명령을 실행할 때마다 스택에 저장하고, undo 시 마지막 명령을 되돌립니다.
 */
public class CommandInvoker {

    // 실행된 명령의 히스토리를 저장하는 스택
    private final Stack<Command> history = new Stack<>();

    /**
     * 명령 실행
     *
     * @param command 실행할 Command 객체
     */
    public void executeCommand(Command command) {
        command.execute();         // 실제 명령 실행
        history.push(command);     // 나중에 undo를 위해 기록
    }

    /**
     * 마지막 실행한 명령 취소 (undo)
     */
    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop(); // 마지막 명령 꺼내기
            command.undo();                  // 되돌리기 실행
        } else {
            System.out.println("되돌릴 명령이 없습니다.");
        }
    }
}
