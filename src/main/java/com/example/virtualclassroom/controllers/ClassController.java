package com.example.virtualclassroom.controllers;

import com.example.virtualclassroom.models.ClassRoom;
import com.example.virtualclassroom.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/classes")
    public String listClasses(Model model) {
        model.addAttribute("classes", classService.getAllClasses());
        return "class_list";
    }

    @GetMapping("/classes/{id}")
    public String classDetails(@PathVariable Long id, Model model) {
        model.addAttribute("classRoom", classService.getClassById(id));
        return "class_details";
    }
}
