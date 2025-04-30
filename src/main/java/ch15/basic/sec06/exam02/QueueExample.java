package ch15.basic.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messagesQueue = new LinkedList<>();
        messagesQueue.offer(new Message("sendMail", "홍길동"));
        messagesQueue.offer(new Message("sendSMS", "신용권"));
        messagesQueue.offer(new Message("sendKakaoTalk", "김자바"));

        while(!messagesQueue.isEmpty()) {
            Message message = messagesQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
                    break;
            }
        }
    }
}
