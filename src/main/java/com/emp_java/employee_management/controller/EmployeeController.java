package com.emp_java.employee_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp_java.employee_management.dto.request.CreateEmployeeRequest;
import com.emp_java.employee_management.dto.request.UpdateEmployeeRequest;
import com.emp_java.employee_management.dto.response.ResponseEmployee;
import com.emp_java.employee_management.service.EmployeeService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<ResponseEmployee> createEmployee(@Valid @RequestBody CreateEmployeeRequest request) {
        ResponseEmployee response = employeeService.creatEmployee(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("{id}")
    public ResponseEntity<ResponseEmployee> updateEmployee(@PathVariable Long id,
            @Valid @RequestBody UpdateEmployeeRequest request) {

        ResponseEmployee response = employeeService.updateEmployee(id, request);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
