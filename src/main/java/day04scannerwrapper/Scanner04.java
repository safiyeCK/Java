package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        //a) alanini hesaplayiniz.
        //b) cevresini hesaplayiniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgene kisa kenar uzunlugu giriniz");
           double  shortSide= input.nextDouble();
        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide= input.nextDouble();

        System.out.println("Alan:" + shortSide*longSide);

        System.out.println("Cevre:" + (2*shortSide +2*longSide));


    }
}
