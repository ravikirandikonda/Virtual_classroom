package com.example.virtualclassroom.repositories;

import com.example.virtualclassroom.models.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
}
