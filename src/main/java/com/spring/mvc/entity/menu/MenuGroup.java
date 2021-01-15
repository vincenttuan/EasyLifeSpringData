package com.spring.mvc.entity.menu;

import com.spring.mvc.entity.store.StoreBranch;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MenuGroup")
public class MenuGroup {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;
    
    @ManyToOne
    private StoreBranch storeBranch;
    
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

    public StoreBranch getStoreBranch() {
        return storeBranch;
    }

    public void setStoreBranch(StoreBranch storeBranch) {
        this.storeBranch = storeBranch;
    }
    
}
