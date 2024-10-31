package com.ensak.model;

public class Produit {
    private String designation;
    private double prix;
    private int qte;

    public Produit(){
    }

    public Produit(String designation, double prix, int qte){
        this.designation=designation;
        this.prix = prix;
        this.qte = qte;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public int getQte() {
        return qte;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

}
