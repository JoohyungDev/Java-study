package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //parent에 들어가 있는게 Child 인스턴스라면
        if (parent instanceof Child child) {
            //Child c = new parent;
            System.out.println("Child 인스턴스 맞음");
            //Child 인스턴스인 경우 childMethod() 실행
            child.childMethod();
        }
    }
}
