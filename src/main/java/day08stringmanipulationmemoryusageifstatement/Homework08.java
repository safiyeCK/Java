package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework08 {
//HOMEWORK
        /*
        1- bir string variable olusturun ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz.
        2= Bir String Variable olusturunuz.Ilk karakter ile son karakter disindaki karakterleri konsala buyuk harflerle yazdiriniz
        3- Bir Strin variable olusturunuz ve bu string deki ilk ve son karakterlerin Ascii degerleini konsola yazdiriniz.
        4- Tek kelimelik bir sehir ismi icin variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harfle konsola yazdirin.
        5- Asagidaki kurallara gore oasword u kontrol ediniz.En az 6 karakter olsun.
             * en az 1 buyuk harf
             en az bir kucuk harf
             en az bir tane de rakam olsun


         */

    public static void main(String[] args) {

        //soru=1) Bir string variable olusturun ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz.
        String s= "Bugun merketten 2 paket un, 3 kutu sos aldim";

        int karakterKontrol = s.replaceAll("[0-9]","").length();
        System.out.println(karakterKontrol);

       //Soru=2)Bir String Variable olusturunuz.Ilk karakter ile son karakter disindaki karakterleri konsala buyuk harflerle yazdiriniz

        String t= "Hayat SupriZlerle DOLUDur";
        String sonuc= t.substring(1,t.length()-1).toUpperCase();
        System.out.println(sonuc);

        String g= "Uyumak istiyorum. Daha fazla ne kadar dayanirim bilmiyorum";
        String ilkHarf= g.substring(1,g.length()-1).toLowerCase();
        System.out.println(ilkHarf);


        //Soru=3)Bir String variable olusturunuz ve bu string deki ilk ve son karakterlerin Ascii degerleini konsola yazdiriniz.

        String str= "Ah su papatya fallari, caresizligim fala mi kaldi";
        int ilkKarakter = str.charAt(0);
        int sonKarakter = str.charAt( str.length()-1);
        System.out.println(ilkKarakter+sonKarakter);

        //Soru=4)Tek kelimelik bir sehir ismi icin variable olusturun ve
        // sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harfle konsola yazdirin.

        String city="AdAnA";
        String citySonuc = city.toUpperCase().charAt(0)+city.toLowerCase().substring(1);
        System.out.println(citySonuc);

        //Soru 5- Asagidaki kurallara gore pasword u kontrol ediniz.
           // En az 6 karakter olsun.
           //  * en az 1 buyuk harf
           // en az bir kucuk harf
          //en az bir tane de rakam olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  en az 6 karakterden olusan sifrenizi giriniz");
        String sifre= scan.next();

        boolean first= sifre.length()>5;
        System.out.println("first="+first);
        boolean second= sifre.replaceAll("[^A-Z]","").length()>0;
        System.out.println("second="+ second);
        boolean third = sifre.replaceAll("^a-z","").length()>0;
        System.out.println("third="+ third);
        boolean fourth = sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("forth="+fourth);
        System.out.println("Sifre gecerli mi?="+(first&&second&&third&&fourth));






    }
}
