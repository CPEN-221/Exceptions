package exceptions1;

public class Main {
    public static void main(String[] args) {
        CourseGrades cpen221 = new CourseGrades(new int[] {10004321, 89542378, 90765211},
            new int[] {56, 89, 77});
        System.out.println(cpen221.toString());

        int studentNumber = 100004321;
        System.out.printf("Grade for student number %8d is %3d.\n", studentNumber,
            cpen221.getGrade(studentNumber));
    }
}
