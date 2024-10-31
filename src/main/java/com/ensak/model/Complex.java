package com.ensak.model;

public class Complex {
    private int r;
    private int i;

    public Complex(int r, int i){
        this.r=r;
        this.i=i;
    }

    public void update(int r, int i){
        this.r=r;
        this.i=i;
    }

    public String getDetail(){
        return "Z="+r+"+"+i+"i";
    }

}
