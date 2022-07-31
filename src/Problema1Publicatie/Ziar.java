package Problema1Publicatie;

public class Ziar extends Publicatie{
    private String sursa;

    public Ziar(String titlu, String sursa) {
        super(titlu);
        //asa se trimite mai departe in clasa parinte titlul
        this.sursa = sursa;
    }@Override
    public String getType() {
        return"Ziar";

    }
    public String getDetalii(){
        System.out.println("-Titlul si sursa: ");
        return  (this.getTitlu()+" " +this.sursa);
    }
}
