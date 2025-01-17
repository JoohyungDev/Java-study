package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();

        //자바에서 대입은 기존 것을 변경하지 않음! 복사해서 넣는다. -> 위에서 poly의 타입은 그대로 Parent
    }
}
