package class1;

// 배열을 사용하면 코드 변경을 최소화할 수 있으나, 학생의 정보가 3개의 배열에 나눠져 있으므로 관리가 어려움
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i <studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);

        }

    }
}
