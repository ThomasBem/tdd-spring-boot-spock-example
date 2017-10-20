package com.github.retirement;

import org.hamcrest.Matchers;
import org.junit.Test;
import spock.util.matcher.HamcrestMatchers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LongServiceAwardVerificationTest {
    @Test
    public void getListOfEligibleEmployees() {
        LongServiceAwardVerification longServiceAwardVerification = new LongServiceAwardVerification();

        Employee employee1 = new Employee();
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setAge(30);
        employee1.setDateStarted(LocalDate.of(2010, 5, 5));

        Employee employee2 = new Employee();
        employee2.setFirstName("Jack");
        employee2.setLastName("Ryan");
        employee2.setAge(42);
        employee2.setDateStarted(LocalDate.of(2005, 1, 1));

        Employee employee3 = new Employee();
        employee3.setFirstName("Lisa");
        employee3.setLastName("Kudrow");
        employee3.setAge(37);
        employee3.setDateStarted(LocalDate.of(2016, 9, 10));

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        List<Employee> eligibleEmployees = longServiceAwardVerification.getListOfEligibleEmployees(employees);

        assertThat("eligible employees is of size 1", eligibleEmployees, Matchers.hasSize(1));
        assertTrue("the eligble employee is Jack", eligibleEmployees.get(0).getFirstName().equals("Jack"));
    }
}
