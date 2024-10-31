package com.ensak.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;

    private List<Facture> factures =  new ArrayList<>();

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client() {
    }

    public Client(long id, String nom, String prenom, String adresse, String tel, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        String detail = "";
        detail+="\t\t\t\t\t\t\t\t\t\t\t\t\t Nom:" +getNom()+" "+getPrenom()+"\n";
        detail+="\t\t\t\t\t\t\t\t\t\t\t\t\t Adresse:" +getAdresse()+"\n";
        detail+="\t\t\t\t\t\t\t\t\t\t\t\t\t Tel:" +getTel()+"\n";
        detail+="\t\t\t\t\t\t\t\t\t\t\t\t\t Email:" +getEmail()+"\n";
        return detail;
    }
}
