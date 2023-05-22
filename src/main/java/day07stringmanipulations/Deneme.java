package day07stringmanipulations;

public class Deneme {
    public static void main(String[] args) {

        //Safiye Cankara isminin ilk ismin ilk, soy ismin ilk harfini alip yaziriniz.

        String s= "  Safiye Cankara";

        char first = s.trim().toUpperCase().charAt(0);

        System.out.println(first);

        char second = s.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(second);

        System.out.println(""+first+second);

    }
}
