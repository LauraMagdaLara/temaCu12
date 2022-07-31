package Problema1Publicatie;

public class Articol extends Publicatie{
    private String autor;

    public Articol(String titlu, String autor) {
        super(titlu);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getType() {
        return"Articol";
        //suprascrieti aceasta metoda in fiecare subclasa
    }
    public String getDetalii(){
        System.out.println("-Titlul si autor: ");
        return  (this.getTitlu()+" " +this.autor);
    }
}
