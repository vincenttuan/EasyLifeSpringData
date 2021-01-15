package com.spring.mvc.entity.store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StoreBranch")
public class StoreBranch {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;
    
    @OneToOne
    private StoreGeo storeGeo;
    
    @ManyToOne
    private Store store;
    
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

    public StoreGeo getStoreGeo() {
        return storeGeo;
    }

    public void setStoreGeo(StoreGeo storeGeo) {
        this.storeGeo = storeGeo;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    
    
}
