package com.ensak.entities.bank;

import java.time.LocalDate;

public class Operation {
    private LocalDate date;
    private String type;
    private double montant;
    private Compte compte;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Operation() {
    }

    public Operation(LocalDate date, String type, double montant, Compte compte) {
        this.date = date;
        this.type = type;
        this.montant = montant;
        this.compte = compte;
    }

    @Override
    public String toString() {
        return date+"\t\t"+type+"\t\t\t"+montant;
    }
}
