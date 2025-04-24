package ch14.hard;

public class MusicRunnable implements Runnable{
    @Override
    public void run(){
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(500); // 0.5초 대기
            }
        } catch (InterruptedException e) {
            System.out.println("음악 스레드가 중단되었습니다.");
            Thread.currentThread().interrupt(); // 인터럽트 상태 복원
        }
    }

}
