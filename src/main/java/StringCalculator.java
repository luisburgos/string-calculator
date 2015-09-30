import java.util.Arrays;
import java.util.List;

/**
 * Created by luisburgos on 30/09/15.
 */
public class StringCalculator {

    public int add(String numbers){

        List<String> numbersList;
        int sumNumbers = 0;

        if(numbers.isEmpty()){
            return sumNumbers;
        }

        if(numbers.equals("1")){
            return sumNumbers = 1;
        }

        numbersList = Arrays.asList(numbers.split("\\s*,\\s*"));
        for(String number : numbersList){
            sumNumbers += Integer.parseInt(number);
        }

        return sumNumbers;
    }

}
