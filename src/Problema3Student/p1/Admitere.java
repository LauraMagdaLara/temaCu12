package Problema3Student.p1;

public class Admitere {
    private static double ultimaMedie;
    private static int locuriTotale;
    private static int locuriOcupate;
    //5
    static{
        ultimaMedie=9;
        locuriTotale=30;
    }

    public static int getLocuriOcupate() {
        return locuriOcupate;
    }

    public static void setLocuriOcupate(int locuriOcupate) {
        Admitere.locuriOcupate = locuriOcupate;
    }

    public static double getUltimaMedie() {
        return ultimaMedie;
    }

    public static void setUltimaMedie(double ultimaMedie) {
        Admitere.ultimaMedie = ultimaMedie;
    }

    public static int getLocuriTotale() {
        return locuriTotale;
    }

    public static void setLocuriTotale(int locuriTotale) {
        Admitere.locuriTotale = locuriTotale;
    }
    //student
     static boolean acceptaStudent(Student student){
        if (locuriOcupate==locuriTotale)
            return false;
        else if (student.getMedieAdmitere()>=getUltimaMedie()) {
         locuriOcupate++;
            return true;
        }
        else return false;
    }
    void schimbaFacultate(Student student, String facultateNoua){
        student.setFacultate(facultateNoua);
        //asa ii setez noua facultate
    }
}
