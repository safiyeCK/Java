package day2datatypesmethodecreation;

import java.util.Scanner;

public class ScannerYapma4 {

    public static void main(String[] args) {

        //Kullanicidan uc farkli data turunde deger alip
        //girilen degerleri aciklamalariyla yazdiriniz.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen ondalik bir sayi giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("Ondalik sayi="+ girilenSayi);

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSAyi= scan.nextInt();

        System.out.println("Tamsayi="+ girilenSAyi);


    }
}
