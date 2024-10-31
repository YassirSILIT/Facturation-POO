package com.ensak;


import com.ensak.model.Produit;

import java.util.ArrayList;

public class MainCafe {
    public static void main(String[] args) {

        ArrayList<Produit> produits = new ArrayList<>();
        produits.add(new Produit("Café noir", 9,1));
        produits.add(new Produit("Jus d'orange", 15,2));
        produits.add(new Produit("Ftour Beldi", 25,2));

        System.out.println("Café ENSAK");
        System.out.println("Serveur : Ali baba");
        System.out.println("\t *****");
        System.out.println("Designation \t Prix \t Qte");
        System.out.println("-----------------------------------");
        double total=0;
        for(Produit p : produits){
                System.out.println(p.getDesignation() + "\t" + p.getPrix() + "\t" +p.getQte());
            total+=p.getPrix()*p.getQte();
        }
        System.out.println("-----------------------------------");
        System.out.println("\t \t \t \t \t Total = "+total);

    }
}