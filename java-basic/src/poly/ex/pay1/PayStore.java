package poly.ex.pay1;

//추상클래스로 객체 생성 막음
public abstract class PayStore {

    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        }
        //null체크 피하는 용도
        else {
            return new DefaultPay();
        }
    }
}