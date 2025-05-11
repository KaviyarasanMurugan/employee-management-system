package com.example.employee.service;

import com.example.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee emp);
    Employee update(Long id, Employee emp);
    Employee getById(Long id);
    List<Employee> getAll();
    void delete(Long id);
}