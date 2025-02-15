package org.example.planificatorcalatorii;


import org.example.planificatorcalatorii.model.Calatorie;
import org.example.planificatorcalatorii.model.Utilizator;
import org.example.planificatorcalatorii.model.Rezervare;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanificatorCalatoriiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanificatorCalatoriiApplication.class, args);
        Calatorie calatorie1 = new Calatorie("Paris", "2025-06-10", "2025-06-20", 1200.5, "Avion");
        Calatorie calatorie2 = new Calatorie("Roma", "2025-07-15", "2025-07-25", 950.0, "Tren");

        // Crearea unor obiecte de tip Utilizator
        Utilizator utilizator1 = new Utilizator("Andrei Popescu", "andrei@gmail.com", "0740123456", 30, "Moldoveneasca");
        Utilizator utilizator2 = new Utilizator("Maria Ionescu", "maria@yahoo.com", "0732987654", 28, "Moldoveneasca");

        // Crearea unor obiecte de tip Rezervare
        Rezervare rezervare1 = new Rezervare(utilizator1, calatorie1, "2025-05-01", "Confirmată");
        Rezervare rezervare2 = new Rezervare(utilizator2, calatorie2, "2025-06-05", "În așteptare");

        System.out.println("===== CĂLĂTORII DISPONIBILE =====");
        System.out.println(calatorie1);
        System.out.println(calatorie2);

        System.out.println("\n===== UTILIZATORI =====");
        System.out.println(utilizator1);
        System.out.println(utilizator2);

        System.out.println("\n===== REZERVĂRI =====");
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }

}
