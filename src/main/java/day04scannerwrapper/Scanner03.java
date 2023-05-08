package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazidriniz

        Scanner input = new Scanner(System.in);

        System.out.println(" Iki sayi giriniz");
        double firstNummer = input.nextDouble();
        double secondNummer= input.nextDouble();

        System.out.println(firstNummer+secondNummer);

        System.out.println(firstNummer-secondNummer);

        System.out.println(firstNummer*secondNummer);

        System.out.println(firstNummer/secondNummer);

    }
}
