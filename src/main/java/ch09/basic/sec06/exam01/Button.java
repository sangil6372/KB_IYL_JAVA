package ch09.basic.sec06.exam01;

public  class Button {
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public static interface ClickListener {
        void onClick();
    }

    public void click() {
        this.clickListener.onClick();
    }

}
