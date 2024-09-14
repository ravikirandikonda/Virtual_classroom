package com.example.virtualclassroom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long lectureId;
    private String content;
    private Long parentId; // For nested discussions

    // Default constructor
    public Discussion() {
    }

    // Parameterized constructor
    public Discussion(Long lectureId, String content, Long parentId) {
        this.lectureId = lectureId;
        this.content = content;
        this.parentId = parentId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Discussion{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", content='" + content + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
