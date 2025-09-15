package com.rajtech.empmgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajtech.empmgt.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
