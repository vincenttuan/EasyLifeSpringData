package com.spring.mvc.controller;

import com.spring.mvc.entity.food.FoodGroup;
import com.spring.mvc.entity.store.StoreGroup;
import com.spring.mvc.repository.FoodGroupRepository;
import com.spring.mvc.repository.StoreGroupRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food_group")
public class FoodGroupController {
    @Autowired
    private FoodGroupRepository foodGroupRepository;
    
    @GetMapping(value = {"/", "/{id}", "/{delete}/{id}"})
    public String read(Model model, 
            @PathVariable Optional<Long> id,
            @PathVariable Optional<String> delete) {
        FoodGroup foodGroup = new FoodGroup();
        String _method = "POST";
        if(id.isPresent()) {
            foodGroup = foodGroupRepository.findOne(id.get());
            if(delete.isPresent() && delete.get().equalsIgnoreCase("delete")) {
                _method = "DELETE";
            } else {
                _method = "PUT";
            }
        }
        model.addAttribute("_method", _method);
        model.addAttribute("foodGroup", foodGroup);
        model.addAttribute("foodGroups", foodGroupRepository.findAll());
        return "food_group";
    }
    
    @PostMapping(value = {"/"})
    public String create(@ModelAttribute("foodGroup") FoodGroup foodGroup) {
        foodGroupRepository.save(foodGroup);
        return "redirect: ./";
    }
    
    @PutMapping(value = {"/"})
    public String update(@ModelAttribute("foodGroup") FoodGroup foodGroup) {
        foodGroupRepository.saveAndFlush(foodGroup);
        return "redirect: ./";
    }
    
    @DeleteMapping(value = {"/"})
    public String delete(@ModelAttribute("foodGroup") FoodGroup foodGroup) {
        foodGroupRepository.delete(foodGroup.getId());
        return "redirect: ./";
    }
}
