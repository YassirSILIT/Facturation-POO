package com.ensak.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Facture {
    private String numero;
    private LocalDate date;
    private double totale;
    private Client client;

    private List<LigneCommande> commandes = new ArrayList<>();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneCommande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<LigneCommande> commandes) {
        this.commandes = commandes;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public Facture() {
    }

    public Facture(String numero, LocalDate date) {
        this.numero = numero;
        this.date = date;

    }

    public Facture(String numero, LocalDate date, Client client) {
        this.numero = numero;
        this.date = date;
        this.client = client;
    }

    public double calculTotal(){
        // parcourir toute la collection des lignes, et faire le calcul
         totale = 0;
        for (LigneCommande lc : commandes){
            totale = totale + lc.getQte()*lc.getProduct().getPrix();
        }
        return totale;
    }

    @Override
    public String toString() {
        String details = "";
        details+="==================================Paiement de facture==============================\n";
        details+="Société XYZ\n";
        details+="===================================================================================\n";
        details+= "N°Facture: " +getNumero()+ "," +getDate()+"\t\t\t\t\t\t\t Client\n";
        details+= client.toString();
        details+= "DESIGNATION \t\t PU \t\t QTE \t\t SOUS TOTAL\n" +
                "===================================================================================\n";
        for (LigneCommande lc : commandes)
            details += lc+"\n";
        details+="===================================================================================\n";
        details+="\t\t\t\t\t\t\t\t\t\tTotal = " +calculTotal();
        return details;
    }
}
