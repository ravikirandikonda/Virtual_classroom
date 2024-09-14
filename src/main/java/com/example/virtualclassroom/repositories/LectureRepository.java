package com.example.virtualclassroom.repositories;

import com.example.virtualclassroom.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
