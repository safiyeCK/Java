package day09ifstatements;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        //1.yol (burada 2 sart kontrol ettik)
        int num= scan.nextInt();
        if(num % 2 == 0){           // % bir sayinin kalanini alir yanina sa bolecegimiz sayiyi yaziyoruz.%2
            System.out.println("cift sayidir");}

               if (num % 2 != 0){
            System.out.println("tek sayidir");}


        //2.yol(burada tek condition(sart) kontrol ettik.If else iki senaryolu durumlarda daha mantikli)
        if (num % 2 ==0){
            System.out.println("Cift sayidir");} else {
            System.out.println("Tek sayidir");}

    }
}
