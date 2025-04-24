package ch14.hard;

public class MovieThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("동영상을 재생합니다.");
                Thread.sleep(1000); // 1초 대기
            }
        } catch (InterruptedException e) {
            System.out.println("스레드가 중단되었습니다.");
            Thread.currentThread().interrupt(); // 인터럽트 상태 복원
        }
    }
}
