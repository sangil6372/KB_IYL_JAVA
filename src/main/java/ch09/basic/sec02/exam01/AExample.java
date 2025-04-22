package ch09.basic.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
//        내부 클래스 B를 인스턴스화
        A.B b = a.new B();
    }
}
