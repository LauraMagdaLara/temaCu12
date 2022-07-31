package Problema2Animale;

public class Dog extends Animal{
    @Override
    void scoateSunet() {
        super.scoateSunet();
        System.out.println("Ham Ham");
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
}
