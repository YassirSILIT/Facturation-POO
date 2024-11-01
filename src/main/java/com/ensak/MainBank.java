package com.ensak;

import com.ensak.entities.bank.Client;
import com.ensak.entities.bank.Compte;
import com.ensak.entities.bank.Operation;

import java.time.LocalDate;

public class MainBank {
    public static void main(String[] args) {
        Client client1 = new Client(1,"Baba","Ali");
        Compte compte1 = new Compte(11,"C-12345",client1);
        Operation operation1 = new Operation(LocalDate.now(),"VERS",1234,compte1);
        Operation operation2 = new Operation(LocalDate.now(),"VERS",6234,compte1);
        Operation operation3 = new Operation(LocalDate.now(),"RETS",1234,compte1);
        Operation operation4 = new Operation(LocalDate.now(),"RETS",2234,compte1);

        compte1.addOperation(operation1);
        compte1.addOperation(operation2);
        compte1.addOperation(operation3);
        compte1.addOperation(operation4);

        System.out.println(compte1.toString());
    }
}
