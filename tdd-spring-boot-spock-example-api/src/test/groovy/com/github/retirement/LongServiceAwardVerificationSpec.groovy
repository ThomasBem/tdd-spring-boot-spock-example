package com.github.retirement

import spock.lang.Specification

import java.time.LocalDate

class LongServiceAwardVerificationSpec extends Specification {
    private LongServiceAwardVerification longServiceAwardVerification

    void setup() {
        longServiceAwardVerification = new LongServiceAwardVerification()
    }

    def "Check if employee is eligible for 10 year service award"() {
        given: "a list of employees"
        def employees = [
                new Employee(firstName: 'John', lastName: 'Doe', age: 30, dateStarted: LocalDate.of(2010, 5, 5)),
                new Employee(firstName: 'Jack', lastName: 'Ryan', age: 42, dateStarted: LocalDate.of(2005, 1, 1)),
                new Employee(firstName: 'Lisa', lastName: 'Kudrow', age: 37, dateStarted: LocalDate.of(2016, 9, 10))
        ]

        when: "verifying who is eligible for 10 year service award"
        def eligibleEmployees = longServiceAwardVerification.getListOfEligibleEmployees(employees)

        then: "a list of employees who have been employed for at least 10 years is returned"
        eligibleEmployees.size() == 1
        eligibleEmployees[0].firstName == 'Jack'
    }
}
