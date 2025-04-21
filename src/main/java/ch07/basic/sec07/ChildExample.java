package ch07.basic.sec07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
//        parent.method3();  Parent에서 선언한 메서드만 사용 가능!
    }
}