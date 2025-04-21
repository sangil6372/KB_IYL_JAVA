package ch06.basic.sec08.exam02;

public class Computer {

    public int sum(int ...values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }


}
