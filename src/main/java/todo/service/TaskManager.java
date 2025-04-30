package todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 할 일(Task)을 관리하는 클래스 (Receiver 역할)
 * 실제 작업을 수행하며, 할 일 추가, 삭제, 조회 기능을 제공
 */
public class TaskManager {

    // 우선순위 오름차순 정렬을 위해 TreeSet 사용 (Task 클래스는 Comparable 구현 필요)
    private final Set<Task> tasks = new TreeSet<>();

    /**
     * 할 일 추가
     *
     * @param task 추가할 Task 객체
     */
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("✅ 할 일 추가됨: " + task);
    }

    /**
     * 할 일 삭제
     *
     * @param task 삭제할 Task 객체
     */
    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("❌ 할 일 삭제됨: " + task);
    }

    /**
     * 현재 할 일 목록을 출력
     */
    public void listTasks() {
        System.out.println("\n===== 📝 현재 할 일 목록 =====");
        if (tasks.isEmpty()) {
            System.out.println("할 일이 없습니다.");
            return;
        }

        int index = 1;
        for (Task task : tasks) {
            System.out.println(index + ". " + task);
            index++;
        }
    }

    /**
     * 할 일 목록을 List 형태로 반환
     * 외부에서 목록을 인덱스로 접근할 수 있도록 변환
     *
     * @return 할 일 리스트
     */
    public List<Task> getTasksAsList() {
        return new ArrayList<>(tasks);
    }
}
