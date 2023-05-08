package day3homework;

import java.util.Scanner;

public class ScannerHomework {
    public static void main(String[] args) {


        //ornek 1* Kullanicidan iki tam sayi isteyiniz.
        // iki tam sayinin tolamini bulunuz ve yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi yaziniz");

        int girilenSayi1= input.nextInt();
        int girilenSayi2= input.nextInt();

        System.out.println("Iki Sayinin Tolami="+ (girilenSayi1+ girilenSayi2));









    }


}
