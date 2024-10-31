package com.ensak;

import com.ensak.model.Produit;

import java.util.ArrayList;

public class Main {

    public static Produit getProduitAvecStockMin(ArrayList<Produit> list){
        Produit pmin = list.get(0);
        // 1ere methode
        for (Produit p: list) {
            if (p.getQte() < pmin.getQte()) {
                pmin=p;
            }
        }
        // 2eme methode
        for (int i = 1; i< list.size(); i++) {
            if (list.get(i).getQte() < pmin.getQte()) {
                pmin=list.get(i);
            }
        }
        return pmin;
    }
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();

        // Initialise product
         Produit p1 = new Produit("TV",2500,20);
         Produit p2 = new Produit("Imprimante",1000,5);
         Produit p3 = new Produit("PC",10000,13);
         // Add product
         produits.add(p1);
         produits.add(p2);
         produits.add(p3);
         // getAll product
         for (Produit p : produits){
             System.out.println("==================");
             System.out.println("La designation du produit  : "+p.getDesignation());
             System.out.println("Le prix du produit : "+p.getPrix());
             System.out.println("Le quantité du produit : "+p.getQte());
         }
        System.out.println("==================");
         double totale = 0;
        for (Produit p: produits) {
            totale+=p.getPrix()*p.getQte();
        }
        System.out.println("Le total = " +totale);

        Produit pStockMin = getProduitAvecStockMin(produits);
        System.out.println("Le stock min est " +pStockMin.getDesignation() + ", quantité = "+pStockMin.getQte());
    }
}