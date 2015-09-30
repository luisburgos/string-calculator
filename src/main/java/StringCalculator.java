import java.util.Arrays;
import java.util.List;

/**
 * Created by luisburgos on 30/09/15.
 */
public class StringCalculator {

    public int add(String numbers){

        String tokenToSplit = "\\s*,\\s*";
        List<String> numbersList;
        int sumNumbers = 0;

        if(numbers.isEmpty()){
            return sumNumbers;
        }

        if(numbers.equals("1")){
            return sumNumbers = 1;
        }

        if(numbers.contains("//")){
            numbers = numbers.replace("//", "");

            int delimiterBeginIndex = numbers.indexOf("//") + 1;
            String delimiterInNumbersString = numbers.substring(delimiterBeginIndex, delimiterBeginIndex + 1);

            tokenToSplit = delimiterInNumbersString;

            numbers = numbers.substring(delimiterBeginIndex + 1);
            numbers = numbers.replace("\n", "");
            numbers = numbers.replaceAll(" ", "");

        }

        if(numbers.contains("\n")){
            if(numbers.indexOf("\n") == numbers.length()){
                numbers = numbers.replace("\n", "");
            }else{
                numbers = numbers.replace("\n", ",");
            }
        }

        numbersList = Arrays.asList(numbers.split(tokenToSplit));

        for(String number : numbersList){
            sumNumbers += Integer.parseInt(number);
        }

        return sumNumbers;
    }

}
