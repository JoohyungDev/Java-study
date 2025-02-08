package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); //return값을 안쓰고 버림 -> 변경되지 않은 기존 객체 반환
        
        System.out.println("obj1 = " + obj1.getValue());
    }
}
