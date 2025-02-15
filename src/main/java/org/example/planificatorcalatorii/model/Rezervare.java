package org.example.planificatorcalatorii.model;

import java.util.Objects;

public class Rezervare {
    private Utilizator utilizator;
    private Calatorie calatorie;
    private String dataRezervare;
    private String status;

    public Rezervare() {}

    public Rezervare(Utilizator utilizator, Calatorie calatorie, String dataRezervare, String status) {
        this.utilizator = utilizator;
        this.calatorie = calatorie;
        this.dataRezervare = dataRezervare;
        this.status = status;
    }

    public Utilizator getUtilizator() { return utilizator; }
    public void setUtilizator(Utilizator utilizator) { this.utilizator = utilizator; }

    public Calatorie getCalatorie() { return calatorie; }
    public void setCalatorie(Calatorie calatorie) { this.calatorie = calatorie; }

    public String getDataRezervare() { return dataRezervare; }
    public void setDataRezervare(String dataRezervare) { this.dataRezervare = dataRezervare; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Rezervare{" +
                "utilizator=" + utilizator +
                ", calatorie=" + calatorie +
                ", dataRezervare='" + dataRezervare + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rezervare rezervare = (Rezervare) o;
        return Objects.equals(utilizator, rezervare.utilizator) &&
                Objects.equals(calatorie, rezervare.calatorie) &&
                Objects.equals(status, rezervare.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilizator, calatorie, status);
    }
}