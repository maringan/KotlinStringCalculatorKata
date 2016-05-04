package lib

import spock.lang.Specification

class StringCalculatorSpec extends Specification {
    def "default constructor test"() {
        given:
        def stringCalculator = new StringCalculator()

        expect:
        stringCalculator.getExpression() == ""
    }
}
