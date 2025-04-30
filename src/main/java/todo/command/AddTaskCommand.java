package todo.command;


import todo.service.Task;
import todo.service.TaskManager;

// alt + enter to import all missing classes
public class AddTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;


    public AddTaskCommand(TaskManager taskManager, int priority, String content){
        this.taskManager = taskManager;
        this.task = new Task(priority, content);
    }


    @Override
    public void execute() {
        taskManager.addTask(task);
    }

    @Override
    public void undo() {
    taskManager.removeTask(task);
        System.out.println("Undo: Task removed: " + task.toString());
    }
}
