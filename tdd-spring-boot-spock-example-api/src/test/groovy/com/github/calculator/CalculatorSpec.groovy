package com.github.calculator

import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "Adding two numbers returns the sum"() {
        when: "a calculator is created"
        def calculator = new Calculator()

        then: "1 plus 1 equals 2"
        calculator.add(1, 1) == 2
    }

    def "Order of numbers to sum up does not matter for the result"() {
        when: "a calculator is created"
        def calculator = new Calculator()

        then: "2 plus 3 is 5"
        calculator.add(2, 3) == 5

        and: "3 plus 2 is 5"
        calculator.add(3, 2) == 5
    }
}
