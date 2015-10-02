import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luisburgos on 30/09/15.
 */
public class StringCalculator {

    private String defaultToken = "\\s*,\\s*";
    private List<String> numbersList;

    public int add(String numbersToSum) throws NegativesNotAllowed {

        int sumNumbers = 0;

        if(numbersToSum.isEmpty()){
            return sumNumbers;
        }else if(numbersToSum.contains("//")) {
            numbersToSum = getNumbersWithoutNewToken(numbersToSum);
        }else if(numbersToSum.contains("\n")){
            numbersToSum = getNumbersWithoutLineBreak(numbersToSum);
        }

        numbersList = Arrays.asList(numbersToSum.split(defaultToken));

        String errorNumbers = "";
        for(String number : numbersList){
            int currentNumberToAdd = Integer.parseInt(number);

            if(!(currentNumberToAdd < 0)){
                sumNumbers += currentNumberToAdd;
            }else{
                errorNumbers += number;
            }
        }

        if(!errorNumbers.isEmpty()){
            throw new NegativesNotAllowed(errorNumbers);
        }

        return sumNumbers;
    }

    private List<Integer> getListOfNumbersFromString(String numbersToSum, String defaultToken) {
        List<String> stringNumbersList = Arrays.asList(numbersToSum.split(defaultToken));
        List<Integer> integerNumbersList = new ArrayList<Integer>();

        for(String number : stringNumbersList){
            int currentNumberToAdd = Integer.parseInt(number);
            integerNumbersList.add(currentNumberToAdd);
        }

        return integerNumbersList;
    }

    private int getNumbersSumFromString(String numbersToSum) {
        return 0;
    }

    private String getNumbersWithoutLineBreak(String numbersToSum) {
        String numbersWithoutLineBreak = numbersToSum;

        if(isBreakLineAtEndOfString(numbersWithoutLineBreak)){
            numbersWithoutLineBreak = numbersWithoutLineBreak.replace("\n", "");
        }else{
            numbersWithoutLineBreak = numbersWithoutLineBreak.replace("\n", ",");
        }

        return numbersWithoutLineBreak;
    }

    private String getNumbersWithoutNewToken(String numbersToSum) {
        String numbersWithoutNewToken = numbersToSum;

        numbersWithoutNewToken = numbersWithoutNewToken.replace("//", "");
        int delimiterBeginIndex = numbersWithoutNewToken.indexOf("//") + 1;
        String newDefaultToken = numbersWithoutNewToken.substring(delimiterBeginIndex, delimiterBeginIndex + 1);
        defaultToken = newDefaultToken;
        numbersWithoutNewToken = numbersWithoutNewToken.substring(delimiterBeginIndex + 1);
        numbersWithoutNewToken = numbersWithoutNewToken.replaceAll(" ", "");
        numbersWithoutNewToken = numbersWithoutNewToken.replace("\n", "");

        return numbersWithoutNewToken;
    }

    private boolean isBreakLineAtEndOfString(String numbersToSum) {
        if(numbersToSum.indexOf("\n") == numbersToSum.length()){
            return true;
        }
        return false;
    }

}
