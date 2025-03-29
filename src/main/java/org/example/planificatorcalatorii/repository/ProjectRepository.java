package org.example.planificatorcalatorii.repository;

import org.example.planificatorcalatorii.model.Rezervare;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProjectRepository {
    private final Map<Integer, Rezervare> projects = new HashMap<>(); // Simulated database
    private int nextId = 1; // Counter for generating unique IDs

    // Find all projects
    public List<Rezervare> findAll() {
        return new ArrayList<>(projects.values());
    }

    // Find a project by ID
    public Rezervare findById(int Id) {
        return projects.get(Id);
    }

    // Save a project (create or update)
    public Rezervare save(Rezervare project) {
        if (project.getId() == 0) { // New project (no ID assigned)
            project.setId(nextId++); // Assign a new ID
        }
        projects.put(project.getId(), project); // Save or update the project
        return project;
    }

    // Delete a project by ID
    public void deleteById(int id) {
        projects.remove(id);
    }
}