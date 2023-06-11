package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02Tekrar {
    public static void main(String[] args) {
        //Ornek 1= Kullanicinin coklu data yi array e yerlestirebilmesi icin ve istedigi zaman
        //durdurabilmesi icin gereken codu yaziniz.
       /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) coklu datayi yerlsetirmek icin Array olusturmamiz gerekir
        3)Array olusturmak icin kullanicidan Array e kac tane eleman koyacagini almaliyiz.
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliz.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int Ogrencisayisi= scan.nextInt();
        String ogrenciAdi[]=new String[Ogrencisayisi];
        System.out.println("Ekleme islemini durdurmak isin 'q' harfine basiniz");
        for (int i = 0; i < ogrenciAdi.length ; i++) {
            System.out.println((i + 1) + ". ogrenci adini giriniz");
            String names = scan.next();
            if(names.equalsIgnoreCase("q"))
            {
                break;
            }else{
                ogrenciAdi[i] = names;
            }
        }

    }
}
