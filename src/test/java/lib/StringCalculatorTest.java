package lib;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void defaultConstructorTest() {
        StringCalculator stringCalculator = new StringCalculator();

        assertEquals(stringCalculator.getExpression(), "");
    }
}
