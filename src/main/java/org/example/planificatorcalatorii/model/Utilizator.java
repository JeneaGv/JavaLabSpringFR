package org.example.planificatorcalatorii.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Utilizator {
    private String nume;
    private String email;
    private String telefon;
    private int varsta;
    private String nationalitate;
}