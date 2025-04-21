package ch06.hard;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // 1. 기본 문자열 입력
    public static String read(String title) {
        System.out.print(title); // 줄바꿈 없음
        return scanner.nextLine();
    }

    // 2. 기본값 있는 문자열 입력
    public static String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + "): ");
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            return defaultValue;
        }
        return input;
    }

    // 3. 정수 입력
    public static int readInt(String title) {
        while (true) {
            System.out.print(title);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
            }
        }
    }

    // 4. 기본값 있는 확인(confirm)
    public static boolean confirm(String title, boolean defaultValue) {
        String option = defaultValue ? "(Y/n): " : "(y/N): ";

        while (true) {
            System.out.print(title + " " + option);
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.isEmpty()) {
                return defaultValue;
            } else if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            } else {
                System.out.println("y 또는 n으로 입력해주세요.");
            }
        }
    }


    // 5. 기본값 없이 확인(confirm)
    public static boolean confirm(String title) {
        return confirm(title, true); // 기본값 true로 위 메서드 호출
    }
}
