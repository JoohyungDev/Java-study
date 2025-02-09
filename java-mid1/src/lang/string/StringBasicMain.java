package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; //자바에서 아래처럼 알아서 변형해줌
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
