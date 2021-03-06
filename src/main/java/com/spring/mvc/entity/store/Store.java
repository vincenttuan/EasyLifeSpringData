package com.spring.mvc.entity.store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Store")
public class Store {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;
    
    @ManyToOne
    private StoreGroup storeGroup;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreGroup getStoreGroup() {
        return storeGroup;
    }

    public void setStoreGroup(StoreGroup storeGroup) {
        this.storeGroup = storeGroup;
    }
    
    
    
}
