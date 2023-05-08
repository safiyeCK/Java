package day04scannerwrapper;

import java.util.Scanner;

public class HomeworkDay4 {
    public static void main(String[] args) {

        //1.odev //Kullanicidan aldiginiz 3 adet sayinin ortalamasini alip, konsola yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("3 adet sayi yaziniz");
         double sayi1 = input.nextDouble();
         double sayi2= input.nextDouble();
         double sayi3= input.nextDouble();

        System.out.println((sayi1+sayi2+sayi3)/3);


        //2. odev- Kullanicidan aldigin 3 basamakli bir sayinin rakamlari toplamini yazdiriniz.

        System.out.println("3 basamakli bir sayi yaziniz");
        int number= input.nextInt();

        int birlerBasamagi =number%10;
        number = number / 10;

        int sondanIkinciBasamak=number%10;
        number= number/10;

        int sondanUcuncuBasamak= number%10;
        number= number/10;

        System.out.println(birlerBasamagi+sondanIkinciBasamak+sondanUcuncuBasamak);



    }
}
