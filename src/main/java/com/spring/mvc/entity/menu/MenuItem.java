package com.spring.mvc.entity.menu;

import com.spring.mvc.entity.food.Food;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MenuItem")
public class MenuItem {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String name;
    
    @ManyToOne
    private MenuGroup menuGroup;
    
    @OneToMany
    private List<MenuImage> menuImages = new ArrayList<>();
    
    @ManyToMany
    private List<Food> foods = new ArrayList<>();
    
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

    public MenuGroup getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(MenuGroup menuGroup) {
        this.menuGroup = menuGroup;
    }

    public List<MenuImage> getMenuImages() {
        return menuImages;
    }

    public void setMenuImages(List<MenuImage> menuImages) {
        this.menuImages = menuImages;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
    
    
}
