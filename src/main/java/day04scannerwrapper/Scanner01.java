package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1-Kullanicidan ilk ismini ve ikinci ismini alip, ekrana yazdiriniz.

        Scanner input = new Scanner (System.in);

        //2- Kullaniciya ne istedigimiza dair mesaj vermeliyiz.


        System.out.println("Ilk isminizi giriniz");

        //3- uygun methodu kullanarak kullanicinin verdigi datayi mamory e yerlestiriniz.

        String firstName= input.next();

        System.out.println("Soy isminizi giriniz");

        String lastName=input.next();

        System.out.println(firstName+" "+lastName);
    }
}
