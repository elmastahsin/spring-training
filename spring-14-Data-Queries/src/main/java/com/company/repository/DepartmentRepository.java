package com.company.repository;

import com.company.entity.Department;
import com.company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    //Display all departments in the Furniture Department
    List<Department> findByDepartment(String department);

    //Display all departments in the Health Division
    List<Department> findByDivision(String division);//the same

    List<Department> findByDivisionIs(String division);//the same

    List<Department> findByDivisionEquals(String division);//the same

    //Display all departments with division name ends with 'ics'
    List<Department> findByDivisionEndingWith(String division);


    //Display top 3 departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop3ByDivisionContaining(String pattern);


    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> retrieveDepartmentDivision(List<String> division);





}
