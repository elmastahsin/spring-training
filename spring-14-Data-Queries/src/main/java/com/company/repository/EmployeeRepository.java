package com.company.repository;

import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email address ""
    List<Employee> findByEmail(String email);

    //Display all employees with first name '' and last name '', also show all employees with a email address ''
    List<Employee>  findByFirstNameAndLastNameOrEmail (String firstName, String lastName, String email);

    //Display all employees that first name is not ''
    List<Employee>  findByFirstNameIsNot(String firstName);




}
