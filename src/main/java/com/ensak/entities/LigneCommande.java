package com.ensak.entities;



public class LigneCommande {
    private long id;
    private int qte;
    private double sousTotal;
    private Product product;
    private Facture facture;

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getSousTotal() {
        return sousTotal;
    }

    public void setSousTotal(double sousTotal) {
        this.sousTotal = sousTotal;
    }

    public LigneCommande() {
    }

    public LigneCommande(long id, int qte, Product product) {
        this.id = id;
        this.qte = qte;
        this.product = product;
        this.sousTotal=qte*product.getPrix();
    }

    @Override
    public String toString() {
        String detail = ""+product+"\t\t  "+getQte()+"\t\t\t  "+sousTotal;
        /*detail+="\t\t  "+getQte();
        detail+="\t\t\t  "+sousTotal;
        return detail;*/
        return detail;
    }
}
