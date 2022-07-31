package Problema3Student.p2Problema4;

public class Main {
    public static void main(String[] args) {
        Angajat angajat1=new Angajat("Ion",30,2000,32);
        Angajat angajat2=new Angajat("Maria",40,3000,32);
        Angajat programator1=new Programator("Viorel",24,4000,32,"java","Intellij");
        Angajat programator2=new Programator("Ana",20,4000,32,"python","PyDev");
        Angajat bucatar1=new Bucatar("Corina",25,1500,32,5,"Tocana");
        Angajat bucatar2=new Bucatar("Marian",35,3000,32,8,"ciorba de burta");
        angajat1.munceste();
        angajat2.munceste();
        programator1.munceste();
        programator2.munceste();
        bucatar1.munceste();
        bucatar2.munceste();
        System.out.println(angajat1.cerereLiber(40));
        System.out.println(angajat2.cerereLiber(20));
        System.out.println(programator1.cerereLiber(33));
        System.out.println(programator2.cerereLiber(4));
        System.out.println(bucatar1.cerereLiber(22));
        System.out.println(bucatar2.cerereLiber(112));
        //6
        Angajat[] angajati={angajat1,angajat2,programator1,programator2,bucatar1,bucatar2};
        int medie=0,i=0;
        for (Angajat elem: angajati){
            medie+=elem.salary;
            i++;
            }
        System.out.println("Media salariala a angajatilor este " + medie/i);
    }
}
