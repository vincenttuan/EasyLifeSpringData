package com.spring.mvc.repository;

import com.spring.mvc.entity.food.FoodGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodGroupRepository extends JpaRepository<FoodGroup, Long>{
    
}
