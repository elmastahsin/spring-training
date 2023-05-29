package com.company.repository;

import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //Display all employees with email address ""
    List<Employee> findByEmail(String email);

    //Display all employees with first name '' and last name '', also show all employees with an email address ''
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ''
    List<Employee> findByLastNameStartsWith(String pattern);

    //Display all employees with salaries higher than ''
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ''
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();
    @Query ("SELECT employee FROM Employee employee WHERE employee.email = 'amcnee1@google.es' ")
    Employee retrieveEmployeeDetail();

    @Query ("SELECT employee.salary FROM Employee employee WHERE employee.email = 'amcnee1@google.es' ")
    Integer retrieveEmployeeSalary();

    // Not equal
    @Query("SELECT employee FROM Employee employee WHERE employee.salary <> ?1")
    List<Employee>  retrieveEmployeeSalaryNotEqual(Integer salary);

    //Like / Contains / StartsWith / EndsWith
    @Query("SELECT employee FROM Employee employee WHERE employee.firstName LIKE ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less than
    @Query("SELECT employee FROM Employee employee WHERE employee.salary < ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(Integer salary);

    //Greater than

    @Query("SELECT employee FROM Employee employee WHERE employee.salary > ?1")
    List<Employee> retrieveEmployeeSalaryGreaterThan(Integer salary);


}
