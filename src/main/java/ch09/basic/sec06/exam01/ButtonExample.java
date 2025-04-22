package ch09.basic.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭");
            }
        }
//      구현 객체 주입
        btnOk.setClickListener(new OkListener());
        btnOk.click();

    }
}
