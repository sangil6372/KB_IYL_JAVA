package ch09.hard.sec05.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkLister implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("클릭");
            }
        }

        btnOk.setClickListener(new OkLister());
        btnOk.click();

    }
}
