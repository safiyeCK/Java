package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1= Kullanicinin coklu data yi array e yerlestirebilmesi icin ve istedigi zaman
        //durdurabilmesi icin gereken codu yaziniz.

        /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) coklu datayi yerlsetirmek icin Array olusturmamiz gerekir
        3)Array olusturmak icin kullanicidan Array e kac tane eleman koyacagini almaliyiz.
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliz.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Luten eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElements= input.nextInt();

          // bunu yukari da belirttik o yuzden bunu yazdik
        System.out.println("Ekleme islemini durdurmek icin 'q' ya basiniz");

        String stdNames[]=new String[numOfElements];

        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println((i+1 )+ " . ogrencinin isnimi giriniz...");
            String name= input.next();
            if(name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i]=name;
            }

        }
        System.out.println(Arrays.toString(stdNames));

    }

}
