package lib

import org.testng.Assert.*
import org.testng.annotations.Test


class StringCalculatorTestNG {
    @Test fun defaultConstructorTest() {
        assertEquals(StringCalculator().expression, "")
    }
}