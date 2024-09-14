package com.example.virtualclassroom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ElementCollection;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.util.List;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ElementCollection
    @CollectionTable(name = "classroom_units", joinColumns = @JoinColumn(name = "classroom_id"))
    @Column(name = "unit")
    private List<String> units; // Books

    @ElementCollection
    @CollectionTable(name = "classroom_sessions", joinColumns = @JoinColumn(name = "classroom_id"))
    @Column(name = "session")
    private List<String> sessions; // Chapters

    // Default constructor
    public ClassRoom() {
    }

    // Parameterized constructor
    public ClassRoom(String name, String description, List<String> units, List<String> sessions) {
        this.name = name;
        this.description = description;
        this.units = units;
        this.sessions = sessions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getUnits() {
        return units;
    }

    public void setUnits(List<String> units) {
        this.units = units;
    }

    public List<String> getSessions() {
        return sessions;
    }

    public void setSessions(List<String> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", units=" + units +
                ", sessions=" + sessions +
                '}';
    }
}
