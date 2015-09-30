
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luisburgos on 30/09/15.
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void initialize(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void inputEmptyStringReturns0(){
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void input1Returns0(){
        assertEquals(1, stringCalculator.add("1"));
    }

}