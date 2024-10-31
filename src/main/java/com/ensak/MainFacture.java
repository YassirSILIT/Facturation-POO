package com.ensak;

import com.ensak.entities.Client;
import com.ensak.entities.Facture;
import com.ensak.entities.LigneCommande;
import com.ensak.entities.Product;

import java.time.LocalDate;

public class MainFacture {
    public static void main(String[] args) {

        Client client = new Client(1,"yassir","silit","larache-morocco","0622572313","yassir.silit@outlook.com");

        Facture facture = new Facture("F-N1", LocalDate.now(),client);

        Product p1 = new Product(11,"PC hp",5466);
        Product p2 = new Product(12,"Usb-5",466);
        Product p3 = new Product(13,"Desk",9466);
        Product p4 = new Product(14,"PC dell",6466);

        LigneCommande lc1 = new LigneCommande(21,3,p1);
        LigneCommande lc2 = new LigneCommande(22,2,p2);
        LigneCommande lc3 = new LigneCommande(23,5,p3);
        LigneCommande lc4 = new LigneCommande(24,8,p4);

        facture.getCommandes().add(lc1);
        facture.getCommandes().add(lc2);
        facture.getCommandes().add(lc3);
        facture.getCommandes().add(lc4);
        facture.calculTotal();

        //Afficher le détail de la facture
        System.out.println(facture.toString());







        /*System.out.println("\t\t\t\t\t\t\t\t\t\tTotal = " +facture.calculTotal());
        System.out.println("===================================================================================");
        System.out.println("==================================Paiement de facture================================");
        System.out.println("Société XYZ");
        System.out.println("N°Facture: " +facture.getNumero()+ "," +facture.getDate()+"\t\t\t\t\t\t\t Client");
        System.out.println(client.toString());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Nom:" +client.getNom()+" "+client.getPrenom());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Adresse:" +client.getAdresse());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Tel:" +client.getTel());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Email:" +client.getEmail());*/
        /*System.out.println(p1.toString()+" "+lc1.toString());
        System.out.println(p2.toString()+" "+lc2.toString());
        System.out.println(p3.toString()+" "+lc3.toString());
        System.out.println(p4.toString()+" "+lc4.toString());*/

    }
}
