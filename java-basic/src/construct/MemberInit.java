package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // this는 자기 자신의 인스턴스 참조값을 가르킴
        // 변수는 가까운거 먼저 확인해서 가져옴
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
