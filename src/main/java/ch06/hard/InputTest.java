package ch06.hard;

import ch06.hard.Input;  // Input 클래스 위치에 따라 경로 수정 필요

public class InputTest {
    public static void main(String[] args) {
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);

        String defaultName = Input.read("이름", "홍길동");
        System.out.println("입력값: " + defaultName);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean confirm1 = Input.confirm("종료할까요?", false);
        System.out.println("입력값: " + confirm1);

        boolean confirm2 = Input.confirm("종료할까요?");
        System.out.println("입력값: " + confirm2);
    }
}

