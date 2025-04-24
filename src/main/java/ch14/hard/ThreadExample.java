package ch14.hard;

public class ThreadExample {
    public static void main(String[] args) {
        // 1. MovieThread 인스턴스 생성 (Thread 상속 방식)
        Thread movieThread = new MovieThread();

        // 2. MusicRunnable 인스턴스 생성 → Thread에 전달 (Runnable 구현 방식)
        Runnable musicTask = new MusicRunnable();
        Thread musicThread = new Thread(musicTask);

        // ▶3. 두 스레드 동시에 실행
        movieThread.start();  // "동영상을 재생합니다." 출력 (1초 간격, 3회)
        musicThread.start();  // "음악을 재생합니다." 출력 (0.5초 간격, 6회)

        //  실행 결과: 두 메시지가 번갈아 섞여 출력됨 (비동기 처리)

        // 현재 JVM이 사용할 수 있는 논리 프로세서(스레드 수)
        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("사용 가능한 논리 프로세서(스레드) 수: " + threadCount);

    }
}
