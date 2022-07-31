package Problema1Publicatie;

public class Anunt extends Publicatie{
    private int zilePanaExpira;

    public Anunt(String titlu, int zilePanaExpira) {
        super(titlu);
        this.zilePanaExpira = zilePanaExpira;
    }
    @Override
    public String getType() {
        return"Anunt";

    }
    public String getDetalii(){
        System.out.println("-Titlul si zile pana expira ");
        return  (this.getTitlu()+" " +this.zilePanaExpira);
    }
}
