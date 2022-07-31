package Problema2Animale;

public class Cat extends Animal{
    String favoriteFood;
    @Override
    void scoateSunet(){
        System.out.println("Sunet de animal");
        System.out.println("Miau Miau");

    }

   //poate cumva sa il   ia direct daca am pus ovver si eu sa adaug doar ce e in plus? daaa dai alt ins si alegi metoda si ti-o pune cu super si
    // mai adaugi tu

    @Override
    void afiseazaAnimal() {
        super.afiseazaAnimal();
        System.out.println("Mancarea favorita este " + favoriteFood);

    }

    public Cat(String name, int age, double weight, String favoriteFood) {
        super(name, age, weight);
        this.favoriteFood = favoriteFood;
    }
}
