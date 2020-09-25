package exceptions4;

/**
 * @author Sathish Gopalakrishnan
 */

public class Main {
    public static void main(String[] args) throws NotFoundException {
        CourseGrades cpen221 = new CourseGrades(new int[]{10004321, 89542378, 90765211},
                new int[]{56, 89, 77});
        System.out.println(cpen221);

        int studentNumber = 100094321;
        System.out.printf("Grade for student number %8d is %3d.\n", studentNumber,
                    cpen221.getGrade(studentNumber));
        System.out.println("Invalid student number");
    }
}
