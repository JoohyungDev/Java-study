package lang.Object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        // equals의 기본은 ==과 같다. 따라서 사용자 입맛에 맞게 오버라이딩해서 변경해야 한다.
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
