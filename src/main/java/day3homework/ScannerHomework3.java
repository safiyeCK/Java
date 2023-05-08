package day3homework;

import java.util.Scanner;

public class ScannerHomework3 {

    public static void main(String[] args) {
        //Kullnicidan isim, soyisim ve yasini isteyiniz.
        //Ismin ilk harfi, bosluk, souisim( ,) yas seklinde yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = input.next();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Girilen Bilgiler:"+ isim.charAt(0)+" "+soyisim+","+yas);



    }
}
