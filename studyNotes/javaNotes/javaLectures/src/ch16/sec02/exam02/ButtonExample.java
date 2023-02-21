package ch16.sec02.exam02;

class OkListener implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println("ok 눌렀음");
    }
}
class CancelListener implements Button.ClickListener {
    @Override
    public void onClick() {
        System.out.println("cancel button pushed");
    }
}
public class ButtonExample {
    public static void main(String[] args) {
        //ok 버튼 객체 생성
        Button btnOk = new Button();
        //ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)

        //ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        //ok 버튼 클릭하기
        btnOk.click();

        //-----------------------------------------------------------------------------

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();
        //Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)

        //cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());
        //cancel 버튼 클릭
        btnCancel.click();
    }
}
