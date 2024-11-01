package com.ensak.entities.bank;

import java.util.ArrayList;
import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private double solde;
    /* La relation qui contient une seule reference */
    private Client client; // navigation de reference
    /*  La relation qui contient plusieurs references : collection (List/ArrayList) */
    private List<Operation> operationList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    public Compte() {
    }

    public Compte(int id, String numero, Client client) {
        this.id = id;
        this.numero = numero;
        this.solde = 0;
        this.client = client;
    }
     public void addOperation(Operation operation){
        operationList.add(operation);
     }

     public double calculSolde(){
        solde = 0;
        for (Operation operation : operationList)
            if (operation.getType()=="VERS"){
                solde+= operation.getMontant();
            }
            else solde-= operation.getMontant();
        return solde;
     }

    @Override
    public String toString() {
        String details = "";
        details+="-------------Compte Bancaire--------------\n";
        details+=getClient().toString()+"\n";
        details+="Compte N°:"+"\t\t"+getNumero()+"\n\n";
        details+="Opérations\n";
        details+="-----------------------------------------\n";
        details+="Date\t\t\tType\t\t\tMontant\n";
        details+="-----------------------------------------\n";
        for (Operation op : operationList)
            details+=op.toString()+"\n";
        details+="-----------------------------------------\n";
        details+="\t\t\t\t\t\t Total = "+calculSolde();
        return details;
    }
}
