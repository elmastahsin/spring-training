package com.company.repository;

import com.company.entity.Account;
import com.company.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> finAllByRole(UserRole role);

    //Write a derived query to list all accounts between a range of ages
    List<Account> findAllByAgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartingWith(String address);
    //Write a derived query to sort the list of accounts with age
    List <Account> findAllByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts

    @Query("SELECT a FROM Account a")
    List<Account> fetchAllJPQL();


    //Write a JPQL query to list all admin accounts


    //Write a JPQL query to sort all accounts with age


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    // Can be used with @Param("age") too

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state, city


    //Write a native query to read all accounts with an age higher than a specific value


}
