package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
        // 다른 생성자 호출
        // this는 인스턴스 자신의 참조값을 가리킴
        // 생성자 코드의 첫줄에만 작성 가능!!
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = "+name +", age = "+age+", grade = "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
