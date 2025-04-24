package ch14.basic.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        // 새로운 스레드 생성 (익명 Thread 클래스 사용)
        Thread thread = new Thread() {
            @Override
            public void run() {
                // Toolkit을 이용해 시스템 사운드 기능 사용
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                // 0.5초 간격으로 비프음 5회 재생
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 비프음 출력
                    try {
                        Thread.sleep(500); // 0.5초 일시 정지
                    } catch (Exception e) {
                        // 예외 무시 (간단한 데모용)
                    }
                }
            }
        };
        // 작업 스레드 시작
        thread.start();
        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
