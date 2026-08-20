package com.emp_java.employee_management.service;

import org.springframework.stereotype.Service;

import com.emp_java.employee_management.dto.request.CreateEmployeeRequest;
import com.emp_java.employee_management.dto.request.UpdateEmployeeRequest;
import com.emp_java.employee_management.dto.response.ResponseEmployee;
import com.emp_java.employee_management.entity.Employee;
import com.emp_java.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ResponseEmployee creatEmployee(CreateEmployeeRequest request) {
        if (employeeRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already Exists");
        }

        Employee employee = new Employee();

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPassword(request.getPassword());
        employee.setPhone(request.getPhone());
        employee.setDepartment(request.getDepartment());
        employee.setDesignation(request.getDesignation());
        employee.setSalary(request.getSalary());
        employee.setJoiningDate(request.getJoiningDate());
        employee.setIsActive(true);
        Employee savedEmployee = employeeRepository.save(employee);

        return mapToResponse(savedEmployee);
    }

    public ResponseEmployee updateEmployee(Long id, UpdateEmployeeRequest request) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));

        if (!employee.getEmail().equals(request.getEmail())
                && employeeRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPassword(request.getPassword());
        employee.setPhone(request.getPhone());
        employee.setDepartment(request.getDepartment());
        employee.setDesignation(request.getDesignation());
        employee.setSalary(request.getSalary());
        employee.setJoiningDate(request.getJoiningDate());
        employee.setIsActive(request.getIsActive());

        Employee updatedEmployee = employeeRepository.save(employee);

        return mapToResponse(updatedEmployee);
    }

    private ResponseEmployee mapToResponse(Employee employee) {

        ResponseEmployee response = new ResponseEmployee();

        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setEmail(employee.getEmail());
        response.setPhone(employee.getPhone());
        response.setDepartment(employee.getDepartment());
        response.setDesignation(employee.getDesignation());
        response.setSalary(employee.getSalary());
        response.setJoiningDate(employee.getJoiningDate());
        response.setIsActive(employee.getIsActive());
        response.setCreatedAt(employee.getCreatedAt());
        response.setUpdatedAt(employee.getUpdatedAt());

        System.out.println("it is response from:" + response);
        return response;
    }
}
