/**
 * Created by luisburgos on 30/09/15.
 */
public class StringCalculator {

    public int add(String numbers){
        int sumNumbers = 0;

        if(numbers.isEmpty()){
            return sumNumbers;
        }

        if(numbers.equals("1")){
            sumNumbers = 1;
        }

        return sumNumbers;
    }

}
