package day3homework;

public class RunnerTeach {
    public static void main(String[] args) {

        // Class ismi + objet ismi+ Assignment operator + "nev " keyword+ Constructor

        Teach teacher = new Teach();

        System.out.println("teacher.name = " + teacher.name);

        System.out.println("teacher.surname = " + teacher.surname);

        System.out.println("teacher.age = " + teacher.age);

        System.out.println("teacher.adres = " + teacher.adres);

        System.out.println("teacher.brans = " + teacher.brans);

        teacher.dersGunleri();

        teacher.nobet();

    }
}
