package com.ensak;

import com.ensak.model.Complex;

public class Main2 {
    public static void main(String[] args) {
        Complex T[] = new Complex[3];
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(5,9);
        T[0]=c1;
        T[1]=c2;
        T[2]=c2;
        for (int i = 0; i < T.length ; i++) {
            System.out.println(T[i].getDetail());
        }
        System.out.println(c2.getDetail());
    }
}
