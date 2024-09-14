package com.example.virtualclassroom.repositories;

import com.example.virtualclassroom.models.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassRoom, Long> {
}
