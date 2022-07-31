package Problema1Publicatie;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problema 1 Publicatie&subclase");
        Publicatie publicatie = new Publicatie("Art");
        Publicatie ziar = new Ziar(" Casa si familie", "Cartea familiei");
        Publicatie articol = new Articol(" Zile de vara", "Maria Tudor");
        Publicatie anunt = new Anunt(" Zile de vara", 7);
        Publicatie[] datePublicatie = {publicatie, ziar, articol, anunt};
        for (Publicatie elem : datePublicatie) {
            elem.getInfo();
            //verific daca merge si para parametru ce afiseaza altfel tb un camp Publicatie date

        }
    }
}
