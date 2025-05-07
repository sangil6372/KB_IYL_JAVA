package ch16.basic.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //매개변수가 두 개일 경우
        person.action1(
                (name, job) -> System.out.println(name + "은 " + job + "을 하고 있습니다.")
        );
        person.action1(
                ((name, job) -> System.out.println(name + "은 " + job + "을 하고 있지 않습니다."))
        );
        //매개변수가 한 개일 경우
        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
    }
}

