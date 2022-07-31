package Problema3Student.p2Problema4;

public class Bucatar extends Angajat{
    int nrFeluriMancareStiute;
    String felPreferat;

    public Bucatar(String name, int age, double salary, int zileLibere, int nrFeluriMancareStiute, String felPreferat) {
        super(name, age, salary, zileLibere);
        this.nrFeluriMancareStiute = nrFeluriMancareStiute;
        this.felPreferat = felPreferat;

    }@Override
    void munceste(){
        System.out.println("Acest angajat munceste");
        System.out.println("Bucatarul "+super.name+" stie sa gateasca "+nrFeluriMancareStiute+" iar felul preferat este "+felPreferat);
    }
}
