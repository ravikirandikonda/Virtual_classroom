package com.example.virtualclassroom.services;

import com.example.virtualclassroom.models.Lecture;
import com.example.virtualclassroom.repositories.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;

    public Lecture getLectureById(Long id) {
        return lectureRepository.findById(id).orElse(null);
    }
}
