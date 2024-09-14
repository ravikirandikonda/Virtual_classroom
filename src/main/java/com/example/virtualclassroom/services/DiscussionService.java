package com.example.virtualclassroom.services;

import com.example.virtualclassroom.models.Discussion;
import com.example.virtualclassroom.repositories.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();
    }

    public void saveDiscussion(Discussion discussion) {
        discussionRepository.save(discussion);
    }
}
