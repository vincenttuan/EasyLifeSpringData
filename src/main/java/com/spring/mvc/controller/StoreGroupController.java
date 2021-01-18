package com.spring.mvc.controller;

import com.spring.mvc.entity.store.StoreGroup;
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
@RequestMapping("/store_group")
public class StoreGroupController {
    @Autowired
    private StoreGroupRepository storeGroupRepository;
    
    @GetMapping(value = {"/", "/{id}", "/{delete}/{id}"})
    public String read(Model model, 
            @PathVariable Optional<Long> id,
            @PathVariable Optional<String> delete) {
        StoreGroup storeGroup = new StoreGroup();
        String _method = "POST";
        if(id.isPresent()) {
            storeGroup = storeGroupRepository.findOne(id.get());
            if(delete.isPresent() && delete.get().equalsIgnoreCase("delete")) {
                _method = "DELETE";
            } else {
                _method = "PUT";
            }
        }
        model.addAttribute("_method", _method);
        model.addAttribute("storeGroup", storeGroup);
        model.addAttribute("storeGroups", storeGroupRepository.findAll());
        return "store_group";
    }
    
    @PostMapping(value = {"/"})
    public String create(@ModelAttribute("storeGroup") StoreGroup storeGroup) {
        storeGroupRepository.save(storeGroup);
        return "redirect: ./";
    }
    
    @PutMapping(value = {"/"})
    public String update(@ModelAttribute("storeGroup") StoreGroup storeGroup) {
        storeGroupRepository.saveAndFlush(storeGroup);
        return "redirect: ./";
    }
    
    @DeleteMapping(value = {"/"})
    public String delete(@ModelAttribute("storeGroup") StoreGroup storeGroup) {
        storeGroupRepository.delete(storeGroup.getId());
        return "redirect: ./";
    }
}
