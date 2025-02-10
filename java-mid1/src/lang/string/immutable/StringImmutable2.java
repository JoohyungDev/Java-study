package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        //String은 불변이라 객체를 새로 만들어서 사용해야 함
        String str2 = str1.concat("java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
