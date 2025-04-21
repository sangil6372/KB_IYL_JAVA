package ch07.basic.sec07;

public class ChildExample2 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//        parent.field2 = "data2"; Parent에 정의된 내용만 사용 가능
//        parent.method3();
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}