package com.emp_java.employee_management.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ResponseEmployee {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String department;
    private String designation;
    private BigDecimal salary;
    private LocalDate joiningDate;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
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
    public Boolean getIsActive() {
        return isActive;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
