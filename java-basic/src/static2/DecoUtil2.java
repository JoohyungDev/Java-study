package static2;

public class DecoUtil2 {
    //static이 붙은 정적 메서드는 객체 생성 없이 클래스명 + dot + 메서드명으로 바로 호출 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
