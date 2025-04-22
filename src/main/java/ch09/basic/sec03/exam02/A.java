package ch09.basic.sec03.exam02;

public class A {
    static class B{
        int field1 = 1;
        //정적 필드(Java 17부터 허용)
        static int field2 = 2;
        B() {
            System.out.println("B-생성자 실행");
        }
        void method1() {
            System.out.println("B-method1 실행");
        }
        //정적 메소드(Java 17부터 허용)
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
}
