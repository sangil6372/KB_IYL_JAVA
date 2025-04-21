package ch07.sec12;

public class Cat extends Animal {

    public Cat(String name) {
        name = "나비";
    }

    //추상 메소드 재정의
    @Override
    public void sound()
    {
        System.out.println("야옹");
    }
}

