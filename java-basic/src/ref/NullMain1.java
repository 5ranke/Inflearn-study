package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조하지 않는다.
        System.out.println("1. data = " + data);
        data = new Data(); // 새로운 객체 대입 (참조값)
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
    // JVM의 GC(Garbage Collection) -> 아무도 참조하지 않는 데이터 자동으로 삭제함
}
