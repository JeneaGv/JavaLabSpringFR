package org.example.planificatorcalatorii.controller;

import lombok.RequiredArgsConstructor;
import org.example.planificatorcalatorii.model.Rezervare;
import org.example.planificatorcalatorii.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/projects") // Base URL for project-related endpoints
public class ProjectController {
    private final ProjectService projectService;
    // GET: Get all projects
    @GetMapping
    public List<Rezervare> findAll() {
        return projectService.findAll();
    }

    // GET: Get a project by ID
    @GetMapping("/{id}")
    public Rezervare findById(@PathVariable int id) {
        return projectService.findById(id);
    }

    // POST: Create a new project
    @PostMapping
    public Rezervare save(@RequestBody Rezervare project) {
        return projectService.save(project);
    }

    // PUT: Update an existing project
    @PutMapping("/{id}")
    public Rezervare update(@PathVariable int id, @RequestBody Rezervare project) {
        project.setId(id); // Ensure the ID matches the path variable
        return projectService.save(project);
    }


    // PATCH: Partially update an existing project
    @PatchMapping("/{id}")
    public ResponseEntity<Rezervare> patch(@PathVariable int id, @RequestBody Map<String, Object> updates) {
        try {
            Rezervare existingProject = projectService.findById(id);
            if (existingProject == null) {
                return ResponseEntity.notFound().build();
            }

            // Aplică actualizările folosind reflexie
            updates.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Rezervare.class, key);
                if (field != null) {
                    field.setAccessible(true);
                    ReflectionUtils.setField(field, existingProject, value);
                }
            });

            Rezervare updatedProject = projectService.save(existingProject);
            return ResponseEntity.ok(updatedProject);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // DELETE: Delete a project by ID
    @DeleteMapping("/{Id}")
    public void deleteById(@PathVariable int Id) {
        projectService.deleteById(Id);

    }

}