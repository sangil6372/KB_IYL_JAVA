package todo.service;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Task 클래스는 하나의 할 일을 나타내며,
 * 우선순위(priority)와 내용(content)을 포함합니다.
 * TreeSet 등에 사용하기 위해 Comparable 인터페이스를 구현합니다.
 */
@Data
@AllArgsConstructor
public class Task implements Comparable<Task> {

    // 우선순위 (1이 가장 높음)
    private int priority;

    // 할 일 내용
    private String content;

    @Override
    public String toString() {
        return "[우선순위: " + priority + "] " + content;
    }

    /**
     * Task 정렬 기준 정의
     * - 우선순위 오름차순
     * - 우선순위가 같으면 content 알파벳 순으로 정렬
     *
     * @param other 비교할 Task 객체
     * @return 정렬 우선순위 결과
     */
    @Override
    public int compareTo(Task other) {
        int result = Integer.compare(this.priority, other.priority);

        // 우선순위가 같다면 내용(content)으로 사전순 정렬
        if (result == 0) {
            result = this.content.compareTo(other.content);
        }

        return result;
    }
}
