package exceptions3;

/**
 * @author Sathish Gopalakrishnan
 */

public class NotFoundException extends Exception {

    public NotFoundException(String errorMsg) {
        super(errorMsg);
    }

}
