package exceptions1;

/**
 * @author Sathish Gopalakrishnan
 */

import java.util.Arrays;
import java.util.Formatter;

public class CourseGrades {
    private int[] classList;
    private int[] classGrades;

    /**
     * Create a new CourseGrades instance
     *
     * @param _classList   holds student numbers. {@code _classList} is not null.
     * @param _classGrades holds student grades.
     *                     <br />{@code _classGrades} is not null and
     *                     {@code _classList.length == _classGrades.length}.
     */
    public CourseGrades(int[] _classList, int[] _classGrades) {
        if (_classList.length != _classGrades.length) {
            throw new IllegalArgumentException(
                "class list and class grades must be of the same length");
        }
        classList = Arrays.copyOf(_classList, _classList.length);
        classGrades = Arrays.copyOf(_classGrades, _classGrades.length);
    }

    /**
     * Obtain a String representation of a CourseGrades instance,
     * with a student number and the associate grade per line.
     *
     * @return a String representation of a CourseGrades instance.
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        Formatter formatter = new Formatter(output);
        for (int i = 0; i < classList.length; i++) {
            formatter.format("%8d: %3d\n", classList[i], classGrades[i]);
        }
        return output.toString();
    }

    /**
     * Find the index of a student in the class list using the student number.
     * @param studentNumber is the student number of the student to find.
     * @return the index in the class list that corresponds to the given student number.
     * @throws NotFoundException if the student number does not occur in the class list.
     */
    private int findIndex(int studentNumber) throws NotFoundException {
        for (int i = 0; i < classList.length; i++) {
            if (classList[i] == studentNumber) {
                return i;
            }
        }
        throw new NotFoundException("cannot find the student number in the class list");
    }

    /**
     * Find the grade of a student using the student number
     *
     * @param studentNumber is the student number for the student whose grade has been requested
     * @return the grade of the student with the provided student number
     */
    public int getGrade(int studentNumber) {
        int index;
        try {
            index = findIndex(studentNumber);
        }
        catch (NotFoundException nfe) {
            throw new IllegalArgumentException("invalid student number");
        }
        return classGrades[index];
    }
}
