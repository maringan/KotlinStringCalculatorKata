package lib

import org.junit.Test
import org.junit.Assert.*

class StringCalculatorTestJUnit {
    @Test fun defaultConstructorTest() {
        assertEquals(StringCalculator().expression, "")
    }
}