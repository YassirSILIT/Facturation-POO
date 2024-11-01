package com.ensak.entities.facturation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private long id;
    private String designation;
    private double prix;

    private List<LigneCommande> commandes = new ArrayList<>();

    public List<LigneCommande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<LigneCommande> commandes) {
        this.commandes = commandes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Product(long id, String designation, double prix) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
    }
    public Product() {
    }

    @Override
    public String toString() {
        return designation+"\t\t\t\t"+prix;
    }
}
