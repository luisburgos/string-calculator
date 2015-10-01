/**
 * Created by luisburgos on 30/09/15.
 */
public class NegativesNotAllowed extends Exception {

    private String errorMessage = "Negatives Not Allowed: ";

    public NegativesNotAllowed(String negativeNumbers){
        this.errorMessage += negativeNumbers;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
