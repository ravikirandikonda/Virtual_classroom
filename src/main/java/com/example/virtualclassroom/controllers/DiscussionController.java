package com.example.virtualclassroom.controllers;

import com.example.virtualclassroom.models.Discussion;
import com.example.virtualclassroom.services.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/discussions")
    public String listDiscussions(Model model) {
        model.addAttribute("discussions", discussionService.getAllDiscussions());
        return "discussions";
    }

    @PostMapping("/discussions")
    public String addDiscussion(@RequestParam Long lectureId,
                                @RequestParam String content) {
        Discussion discussion = new Discussion();
        discussion.setLectureId(lectureId);
        discussion.setContent(content);
        discussionService.saveDiscussion(discussion);
        return "redirect:/discussions";
    }
}
