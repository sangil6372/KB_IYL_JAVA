package ch16.basic.sec02.exam02;

public class Button {

    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        this.listener.onClick();
    }
}
