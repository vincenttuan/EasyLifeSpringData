package com.spring.mvc.repository;

import com.spring.mvc.entity.store.StoreGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreGroupRepository extends JpaRepository<StoreGroup, Long>{
    
}
