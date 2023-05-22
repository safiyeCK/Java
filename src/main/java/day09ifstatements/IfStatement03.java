package day09ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch = scan.next().charAt(0);

        //1. yol
        /*if (ch>='A' && ch <='Z'){
            System.out.println("Buyuk harf");
        }


        if (ch>='a' && ch <='z'){
            System.out.println("Kucuk harf");
        }

         */

        //2. yol


        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");

        } else if (ch >= 'a' && ch <= 'z') {

            System.out.println("Kucuk harf");

        } else {https://lms.techproeducation.com/mod/book/view.php?id=7532

            System.out.println("Harf degil");
        }

    }
}
