package com.lucian.employeemanager.repository;

import com.lucian.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id); //Spring automatically creates a query to delete the employee by id
    Optional<Employee> findEmployeeById(Long id);
}
