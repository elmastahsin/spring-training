package com.company.repository;

import com.company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);

    //Display all regoions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Dsiplay all regions with country name includes 'United' in order
    List<Region> findByCountryContainsOrderByRegion(String country);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);

    //Display top country Contains 'United' in order
    List<Region> findTopByCountryContainsOrderByRegion(String country);


}
