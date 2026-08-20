package com.emp_java.employee_management.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CreateEmployeeRequest {
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Minimum 2 and maximum 50 character is needed")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 4, max = 20, message = "minimum 4 and maximum 8 character is needed")
    private String password;

    @Size(min = 11, max = 14, message = "minimum 11 and maximum 14 character is needed")
    private String phone;

    @NotBlank(message = "Department is required")
    private String department;

    @NotBlank(message = "Designation is required")
    private String designation;

    @NotNull(message = "Salary is required")
    @Positive(message = "Salary should be greater than 0")
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    @NotNull(message = "Joining date is requried")
    @PastOrPresent(message = "Joining date cannot be in future")
    private LocalDate joiningDate;

}
