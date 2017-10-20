package com.github.retirement;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class LongServiceAwardVerification {

    public List<Employee> getListOfEligibleEmployees(List<Employee> employees) {
        return employees.stream().filter(this::isEligible).collect(Collectors.toList());
    }

    private boolean isEligible(Employee employee) {
        LocalDate dateNow = LocalDate.now();
        int yearsEmployed = Period.between(employee.getDateStarted(), dateNow).getYears();
        return yearsEmployed >= 10;
    }
}
