package com.example.virtualclassroom.services;

import com.example.virtualclassroom.models.ClassRoom;
import com.example.virtualclassroom.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<ClassRoom> getAllClasses() {
        return classRepository.findAll();
    }

    public ClassRoom getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public void saveClass(ClassRoom classRoom) {
        classRepository.save(classRoom);
    }
}
