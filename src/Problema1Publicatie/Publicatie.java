package Problema1Publicatie;

public class Publicatie {
    private String titlu;

    public Publicatie(String titlu) {
        this.titlu = titlu;
    }

    public String getType() {
        return"Publicatie";
        //suprascrieti aceasta metoda in fiecare subclasa
    }
    public String getDetalii(){
        return "-Titlul: " + titlu;

    }

    public String getTitlu() {
        return titlu;
    }
    public final void getInfo(){
        System.out.println(getType() + getDetalii());

    }
}
