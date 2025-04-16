package ch06;

public class Car5 {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setSpeed(int speed) {
        this.speed = speed <= 0 ? 0 :speed;
    }

    public void setStop(boolean stop) {
        if (stop) speed = 0;
        this.stop = stop;
    }
}
