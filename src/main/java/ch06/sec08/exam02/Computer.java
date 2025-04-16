package ch06;

public class Computer {

    public int sum(int ...values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }


}
