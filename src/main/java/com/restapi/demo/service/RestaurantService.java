package com.restapi.demo.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.demo.model.grades;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface RestaurantService extends JpaRepository<grades, Long>{
    //todo
}