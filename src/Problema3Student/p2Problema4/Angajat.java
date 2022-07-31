package Problema3Student.p2Problema4;

public class Angajat {
    //pot folosi si default
    String name;
    int Age;
    double salary;
    int zileLibere;

    public Angajat(String name, int age, double salary, int zileLibere) {
        this.name = name;
        Age = age;
        this.salary = salary;
        this.zileLibere = zileLibere;
    }
     void munceste(){
        System.out.println("Acest angajat munceste");
    }
    boolean cerereLiber(int cereLibere){
        if (cereLibere<zileLibere){
            //nu uita sa scazi
            zileLibere-=cereLibere;
        return true;}
        else return false;

    }
}
