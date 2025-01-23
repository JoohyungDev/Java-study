package poly.ex3;

//추상 클래스 : 부모 클래스 역할, 실제 생성되면 안되는 클래스(동물예제(ex2)에서 Animal 클래스 참고)
//new를 사용하여 직접 인스턴스를 생성하지 못하도록 제약
public abstract class AbstractAnimal {

    //1. 추상 메서드를 사용한다면 반드시 클래스도 추상클래스가 되야 함
    //2. 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 함
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
