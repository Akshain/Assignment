package com.prodapt.SpringBootBasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.SpringBootBasics.entity.Electronic;
@Repository
public interface ElectronicRepository extends JpaRepository<Electronic, Integer>{

}
