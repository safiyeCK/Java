package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*
        ornek Asagikai kurallara gore kullanicinin girdigi pasword u kontrol ediniz.
        1) En az 8 karakter olsun
        2) Space karakteri pasword da olmasin
        3) En az bir buyuk harf olsun
        4) En az bir kucuk harf olsun
        5)En az bir rakam olsun
        6) En az bir noktalama isareti olsun
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen paswordunuzu giriniz");

       String pwd =scan.nextLine();

       //1) en az 8 karakter olsun

        boolean first   =pwd.length()>7;
        System.out.println(" first:" +  first);

        // 2) Space karakteri pasword da olmasin
        boolean second= !pwd.contains(" "); // contains medtosu paraztez icinde var mi yok mu bunu getirir.
        //Buarada space iceriyor " " bu halde ama basina ! koyrasak olumsuz yapar. yani space icermez.Olumsuz yapti
        System.out.println("second = " + second);


        //3) En az bir buyuk harf olsun
        boolean third  = pwd.replaceAll("[^A-Z]", "").length()>0;
        //Methodlari ayni satirda yanyana kullanabiliriz.
        //Buyuk harf olmayani sil.
        // Kalan karakter sayisina bak
        //Karakter sayisi 0 ise buyuk harf yok demektir.
        //0 dan buyukse buyuk harf var demektir
        // o nedenle sifirdan buyuk lenght()>0 seklinde yazdik
        // hiclik("") koyduk java buyuk harf haric tum herseyi sildi.Hicligin degeri 0 dir.
        //
        System.out.println("third = " + third);

        //4) En az bir kucuk harf olsun.(

        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0; // sifirdan buyuk mu derken yani en az bir
        //harf var mi demek
        System.out.println("fourth = " + fourth);



        boolean fifth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        boolean sixth = pwd.replaceAll("^\\p{Punct}","").length()>0;
        System.out.println("sixth = " + sixth);

        // pasword un dogru olmasi icin tum basamaklarin dogru olmasi lazim yani AND olmasi lazim

        System.out.println("Pasword gecerli mi?"+(first&&second&&third&&fourth&&fifth&&sixth));
    }



}
