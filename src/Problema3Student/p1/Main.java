package Problema3Student.p1;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Ion","Constructii",8.9);
        Student st2=new Student("Mihai","Transporturi",9);
        Student st3=new Student("Vasile", "ASE", 9.5);
        Student st4=new Student("Maria", "Poli", 9);

     Student[] clasa={st1,st2,st3,st4};
        for(Student elem: clasa){
            System.out.println(Admitere.acceptaStudent(elem));
        }

        for (Student elem: clasa){
         elem.afisare();
     }
    }
}
