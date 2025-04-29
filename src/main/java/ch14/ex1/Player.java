package ch14.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
public class Player implements Runnable {
    private String name;

    // 난수 생성을 위한 Random 객체
    private final Random random = new Random();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // 현재 순서를 저장 (시작 시점의 count)
            int cur = Main.count;

            // 짧은 랜덤 시간 동안 대기 (경합 방지를 위한 짧은 지연)
            Thread.sleep(random.nextInt(5));

            // Main.count가 바뀔 때까지 반복 대기 (다른 스레드가 먼저 count를 증가시키면 대기)
            while (cur != Main.count) {
                cur = Main.count; // 최신 count로 갱신
                // 1000~1800ms 랜덤 시간 대기 (충돌 방지용 추가 지연)
                Thread.sleep(random.nextInt(5) * 200 + 1000);
            }

            synchronized (Main.class){
                // 자신의 차례가 되면 count 증가 (다음 순서로 넘김)
                int callNumber = ++Main.count;
                System.out.println(name + "의 순번은 [" + callNumber + "]번입니다.");
                // 실제 로직 추가 필요 (ex: System.out.println(name + "의 번호는 " + callNumber);)

                if(callNumber == Main.finalNumber){
                    System.out.println(name + " <- 응 너 벌칙이야~");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
