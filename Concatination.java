package day05concatinationoperatortypecasting;

public class Concatination {

    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable olusturun .Strin degeri ile int lerin degerini konsola yazdirin.

        String s=  "elma";
        int a= 10;
        int b= 11;

        System.out.println(s+a+b); //elma1011

        //Java burada ilk s harfinde Srting gordu .Boyle olunca java diger degerlere bakmaz ve hepsini normal yazdirir.
        //Buna concatination denir. Yukarida java soldan saga dogru islem yapar. elma, elma10, elma1011 gibi..

        System.out.println( s+(a+b));// elma21

        // Burada java soldan saga devam eder ve matematigi iyi bilir yani islem onceliigini. Once parantezi yazip topladi
        // sonra da s yi yani elma yazan kismi yazdirdi.


        System.out.println( s+a*b);// elma110

        // Burada java islem onceligini kullaniyor yani once carpiyor sonra elma ile yazdiriyor.

        System.out.println(a+b+s); //21elma

        // Java burada soldan saga sirayla giderken once tam sayilari gordu ve once toladi sonra da elmayi yazdi.

        System.out.println(a+s+b); //10elma11

        // Java da "+" sembolu iki sayi arasinda kullanilirsa TOPLAMA islemi olur.
        //Java da "+" iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa CONCATIOnATIOn islemi yapar.
        // note: concatination isleminde java matematikteki islem onceligi kurallarini kullanir.
        /*
         1- once uslu sayilar
         2- parantez ici islemler yapilir.
         3- carpma ve bolmeler
         4- toplama ve cikarma
         */

        // Ayni oncelikte olanlarda islem soldan saga baslanir.


        ///////////////////////////////////////////////////////////////////////
        //Ornek 2: size String olarak verilen iki fiyatin tolamini ekrana yazdiriniz.

        String shirt = "2300";

        String shoes = "5200";

        System.out.println(shirt+ shoes); // 23005200 seklinde yazar ama bizim istedigimiz bu degil

        // valueOf string degerleri integer a cevirir.

       int  toplamFiyat=Integer.valueOf(shirt)+ Integer.valueOf(shoes);

        System.out.println(toplamFiyat);


       ////////////////////

        // ornek 3. Size string olarak verilen iki fyatin toplamini ekrana yazdirin

        String tv= "$1100";
        String radio = "$300";

        System.out.println(tv+radio);

        int totalPrice= Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        // note= valueOf methodu cok guzeldir fakat bu method tum karakterleri rakam sa eger sayilara cevirir.
        // Eger valueOf methodu kullanilirken Stringen icinde rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        // bu tarz hatalri duzeltmeyi ilerde ogrenecegiz
        // valueOf methodu kullanilirken sadece rakam olan karakterler kullanilmlidir.


    }
}
