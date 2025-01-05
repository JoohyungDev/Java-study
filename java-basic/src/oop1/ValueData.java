package oop1;

public class ValueData {
    int value;

    //메서드 : 객체를 생성해야 호출 가능. static이 붙으면 객체를 생성하지 않아도 메서드 호출이 가능해서 사용x
    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
