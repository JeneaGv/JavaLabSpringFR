package org.example.planificatorcalatorii.model;

import java.util.Objects;

public class Calatorie {
    private String destinatie;
    private String dataPlecare;
    private String dataIntoarcere;
    private double pret;
    private String mijlocTransport;

    public Calatorie() {}

    public Calatorie(String destinatie, String dataPlecare, String dataIntoarcere, double pret, String mijlocTransport) {
        this.destinatie = destinatie;
        this.dataPlecare = dataPlecare;
        this.dataIntoarcere = dataIntoarcere;
        this.pret = pret;
        this.mijlocTransport = mijlocTransport;
    }

    public String getDestinatie() { return destinatie; }
    public void setDestinatie(String destinatie) { this.destinatie = destinatie; }

    public String getDataPlecare() { return dataPlecare; }
    public void setDataPlecare(String dataPlecare) { this.dataPlecare = dataPlecare; }

    public String getDataIntoarcere() { return dataIntoarcere; }
    public void setDataIntoarcere(String dataIntoarcere) { this.dataIntoarcere = dataIntoarcere; }

    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }

    public String getMijlocTransport() { return mijlocTransport; }
    public void setMijlocTransport(String mijlocTransport) { this.mijlocTransport = mijlocTransport; }

    @Override
    public String toString() {
        return "Calatorie{" +
                "destinatie='" + destinatie + '\'' +
                ", dataPlecare='" + dataPlecare + '\'' +
                ", dataIntoarcere='" + dataIntoarcere + '\'' +
                ", pret=" + pret +
                ", mijlocTransport='" + mijlocTransport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calatorie calatorie = (Calatorie) o;
        return Double.compare(calatorie.pret, pret) == 0 &&
                Objects.equals(destinatie, calatorie.destinatie) &&
                Objects.equals(dataPlecare, calatorie.dataPlecare) &&
                Objects.equals(dataIntoarcere, calatorie.dataIntoarcere) &&
                Objects.equals(mijlocTransport, calatorie.mijlocTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinatie, dataPlecare, dataIntoarcere, pret, mijlocTransport);
    }
}