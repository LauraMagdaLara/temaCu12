package Problema2Animale;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Tom", 2, 4.3, "oase");
        Animal cat2 = new Cat("Angela", 3, 2.5, "carne");
        Animal dog1 = new Dog("Azorel", 4, 4.2);
        Animal dog2 = new Dog("Grivei", 7, 8.3);
        Animal[] animale = {cat1, cat2, dog1, dog2};
        //sa vad cum se mai poate scrie array

        System.out.println("Varsta medie a animalelor este: "+ calcVarsta(animale));
        afiseazaPisici(animale);
        //cand returnaza void nu punem print
        latra(animale);
    }
        static double calcVarsta(Animal[] animale){
           int sum=0;
            for (Animal elem: animale)
                sum+= elem.age;
            return sum/4;

        }
        static void afiseazaPisici(Animal[] animale){
            for (Animal elem: animale){
                //cu instanceof
                if (elem instanceof Cat)
                    elem.afiseazaAnimal();
                System.out.println();
            }
    }
    static void latra(Animal[] animale){
        for (Animal elem: animale){
            if (elem instanceof Dog)
            elem.scoateSunet();
        }
    }
}
