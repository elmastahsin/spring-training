package com.company;

import com.company.repository.DepartmentRepository;
import com.company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private  final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------------Region Start-----------------");
        System.out.println("findByCountry:  "+regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining:  "+regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainsOrderByRegion:  " + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println("findTop2ByCountry:  "+regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion:  "+regionRepository.findTopByCountryContainsOrderByRegion("United States"));

        System.out.println("---------------Region End-----------------");

        System.out.println("---------------Department Start-----------------");
        System.out.println("findByDepartment:  "+departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision:  "+departmentRepository.findByDivision("Health"));
    }
}
