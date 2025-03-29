package org.example.planificatorcalatorii.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rezervare {
    private int Id;
    private String dataRezervare;
    private String status;
    private Calatorie calatorie;
    private Utilizator utilizator;
}
