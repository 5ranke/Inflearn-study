package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        // 메서드 호출 시 값 전달 -> 복사해서 전달함!
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
        // 함수 사용 후 변수 x는 없어짐
    }
}
