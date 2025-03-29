package org.example.planificatorcalatorii.service;

import org.example.planificatorcalatorii.model.Rezervare;
import org.example.planificatorcalatorii.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // Get all projects
    public List<Rezervare> findAll() {
        return projectRepository.findAll();
    }

    // Get a project by ID
    public Rezervare findById(int Id) {
        return projectRepository.findById(Id);
    }

    // Save a project (create or update)
    public Rezervare save(Rezervare project) {
        return projectRepository.save(project);
    }

    // Delete a project by ID
    public void deleteById(int Id) {
        projectRepository.deleteById(Id);
    }
}