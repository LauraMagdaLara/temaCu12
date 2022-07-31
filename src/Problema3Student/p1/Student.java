package Problema3Student.p1;

public class Student {
   private final String nume;
   private String facultate;
   private double medieAdmitere;

    public Student(String nume, String facultate, double medieAdmitere) {
        this.nume = nume;
        this.facultate = facultate;
        this.medieAdmitere = medieAdmitere;
    }
    public String getNume() {
        return nume;
    }


    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }

    public void setMedieAdmitere(double medieAdmitere) {
        this.medieAdmitere = medieAdmitere;
    }

    public void afisare(){
        System.out.println("Numele student: " + this.nume);
        System.out.println("Media student: " + this.medieAdmitere);
        System.out.println("Facultatea student:" + this.facultate);
    }
}
