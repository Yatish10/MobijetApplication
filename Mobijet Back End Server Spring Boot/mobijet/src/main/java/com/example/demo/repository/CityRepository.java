package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.City;


@Transactional
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
