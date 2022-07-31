package Problema3Student.p2Problema4;

public class Programator extends Angajat{
    String limbajProgramare;
    String editorCod;

    public Programator(String name, int age, double salary, int zileLibere, String limbajProgramare, String editorCod) {
        super(name, age, salary, zileLibere);
        this.limbajProgramare = limbajProgramare;
        this.editorCod = editorCod;
    }
    @Override
    void munceste(){
       //doar cel in plus tb scris
        System.out.println("Programatorul cu numele "+super.name+" scrie cod "+limbajProgramare+" in editorul "+editorCod);
    }
}
