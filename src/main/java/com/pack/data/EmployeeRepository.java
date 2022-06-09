package com.pack.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
