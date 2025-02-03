package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //여기서 b만 부산으로 바뀜을 예상할 수 있지만 실상은 a,b 둘다 바뀐다.. -> 사이드 이펙트 발생
        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //코드가 길어지면 놓칠 수 있음
    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 ->  " + changeAddress);
        address.setValue(changeAddress);
    }
}
