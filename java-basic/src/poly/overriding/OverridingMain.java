package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        //poly 변수는 Parent타입. 인스턴스는 자식인 Child로 생성했기에 Parent, Child 인스턴스(객체) 둘다 존재
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩x
        poly.method(); //메서드는 오버라이딩!. 오버라이딩된 메서드가 항상 우선권을 가짐
    }
}
