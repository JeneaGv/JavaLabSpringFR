package org.example.planificatorcalatorii.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calatorie {
    private String destinatie;
    private String dataPlecare;
    private String dataIntoarcere;
    private double pret;
    private String mijlocTransport;
}