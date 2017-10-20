package com.github.retirement;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateStarted;
}
