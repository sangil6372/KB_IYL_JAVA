package ch07.basic.sec03;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "흰색");
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
