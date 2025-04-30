package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

import java.util.List;

/**
 * 할 일 삭제 명령(Command) 클래스
 * 지정된 인덱스의 Task를 삭제하며, undo 시 다시 추가합니다.
 */
public class DeleteTaskCommand implements Command {
    private final TaskManager taskManager;
    private final Task task;

    /**
     * 삭제 커맨드 생성자
     *
     * @param taskManager 할 일 관리 객체
     * @param task        삭제할 Task 객체
     * @param index       삭제할 Task의 인덱스 (검증용)
     */
    public DeleteTaskCommand(TaskManager taskManager, Task task, int index) {
        this.taskManager = taskManager;

        List<Task> tasks = taskManager.getTasksAsList();
        if (index >= 0 && index < tasks.size()) {
            this.task = task;
        } else {
            throw new IllegalArgumentException("❌ 잘못된 인덱스입니다: " + (index + 1));
        }
    }

    /**
     * 삭제 실행
     */
    @Override
    public void execute() {
        taskManager.removeTask(task);
    }

    /**
     * 삭제 취소 (되돌리기)
     */
    @Override
    public void undo() {
        taskManager.addTask(task);
        System.out.println("↩️ 삭제 취소됨: " + task);
    }
}
