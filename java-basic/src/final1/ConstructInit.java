package final1;

public class ConstructInit {
    final int value;

    //final을 필드에 적용하는 경우 생성자를 통해 1번만 초기화 가능
    public ConstructInit(int value) {
        this.value = value;
    }
}
