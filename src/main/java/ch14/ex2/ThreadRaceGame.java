package ch14.ex2;

public class ThreadRaceGame {

    public static final int RACE_DISTANCE = 20; // 경주 거리
    public static volatile boolean gameFinished = false; // 누가 먼저 골인했는지 체크

    public static void main(String[] args) {
        System.out.println("💕경주 스타또💖");

        // 참가자 이름 목록
        String[] racers = {"토끼", "거북이", "강아지", "치타"};

        for (String racerName : racers) {
            // Racer 인스턴스 생성 후 스레드 실행
            Thread thread = new Thread(new Racer(racerName));
            thread.setName(racerName); // 스레드 이름 지정
            thread.start();
        }
    }

    // 경주 상황 출력
    public static synchronized void printRaceProgress(String name, int position) {
        // 이름 기반 이모지 매핑
        String emoji = switch (name) {
            case "토끼" -> "🐰";
            case "거북이" -> "🐢";
            case "강아지" -> "🐶";
            case "치타" -> "🐆";
            default -> "🐾";
        };

        // 현재 위치를 문자로 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < RACE_DISTANCE; i++) {
            if (i == position - 1) {
                sb.append(emoji); // 이모지로 표시
            } else {
                sb.append("─");
            }
        }

        System.out.println(name + " : " + sb);
    }

}
