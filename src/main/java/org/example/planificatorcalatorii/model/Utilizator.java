package org.example.planificatorcalatorii.model;


import java.util.Objects;

public class Utilizator {
    private String nume;
    private String email;
    private String telefon;
    private int varsta;
    private String nationalitate;

    public Utilizator() {}

    public Utilizator(String nume, String email, String telefon, int varsta, String nationalitate) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
        this.varsta = varsta;
        this.nationalitate = nationalitate;
    }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    public int getVarsta() { return varsta; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    public String getNationalitate() { return nationalitate; }
    public void setNationalitate(String nationalitate) { this.nationalitate = nationalitate; }

    @Override
    public String toString() {
        return "Utilizator" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", varsta=" + varsta +
                ", nationalitate='" + nationalitate + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilizator that = (Utilizator) o;
        return varsta == that.varsta &&
                Objects.equals(nume, that.nume) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telefon, that.telefon) &&
                Objects.equals(nationalitate, that.nationalitate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, email, telefon, varsta, nationalitate);
    }
}