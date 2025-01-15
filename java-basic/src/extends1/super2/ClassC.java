package extends1.super2;

public class ClassC extends ClassB {
    
    public ClassC() {
        super(10, 20); //기본 생성자가 없으면 개발자가 직접 호출을 해줘야함, 기본 생성자만 있으면 생략 가능
        System.out.println("ClassC 생성자");
    }
}
