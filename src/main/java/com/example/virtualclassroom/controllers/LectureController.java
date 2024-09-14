package com.example.virtualclassroom.controllers;

import com.example.virtualclassroom.models.Lecture;
import com.example.virtualclassroom.services.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @GetMapping("/lectures/{id}")
    public String lectureDetails(@PathVariable Long id, Model model) {
        model.addAttribute("lecture", lectureService.getLectureById(id));
        return "lecture_details";
    }
}
