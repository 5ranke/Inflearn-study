package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // student 2명을 담는 배열의 참조값이 저장
        Student[] students = {student1, student2};

        // 단축어: iter
        for (Student student : students) {
            System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }

        // 자바에서 대입은 변수에 들어 있는 참조값을 복사해서 전달한다.
    }
}