package com.example.lista.model;

import java.io.Serializable;

public class Article implements Serializable {
    private String nom;
    private double price;
    private int qt;

    public Article(String nom, double  price, int qt)  {
        this.nom= nom;
        this.price = price;
        this.qt= qt;
    }

    public String getNom() {
        return nom;
    }

    public double getPrice() {
        return price;
    }

    public int getQt() {
        return qt;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQt(int qt){
        this.qt=qt;
    }

    @Override
    public String toString() {
        return this.nom +"\n"+ this.price+"\n"+this.qt;
    }


}
