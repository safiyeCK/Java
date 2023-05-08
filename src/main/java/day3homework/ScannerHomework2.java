package day3homework;

import java.util.Scanner;

public class ScannerHomework2 {
    public static void main(String[] args) {

        //Kullnicidan bir kelime isteyip ilk harfini yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime= input.next();

        // java da String karakterler index icinde tutulur.
        // 0- 1. index, 1. 2. index.. etc
        // Ali A- index o
        // L - index 1
        //I - index 2... vs

        // JAva ad scan. nextChar() yoktur. Bu yuzden bunun yerine scan.next() yazilir.

        System.out.println("Girilen Kelimenin Ilk Harfi:"+ girilenKelime.charAt(0) );

        // Girlen kelimenin 2. harfini aliniz.

        System.out.println("Girlen Kelimenin Ikinci Harfi:"+ girilenKelime.charAt(1));

        // Kullanicidan tam sayi istedigimizde scan. nextInt(); seklinde yazariz.

    }
}
