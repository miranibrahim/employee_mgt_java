package com.emp_java.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp_java.employee_management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByEmail(String email);
}
