package com.ensak.entities.bank;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private Compte compte; // navigation de reference

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Client() {
    }

    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Client(int id, String nom, String prenom, Compte compte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    @Override
    public String toString() {
        return "Client:"+"\t\t\t"+getPrenom()+" "+getNom();
    }
}
