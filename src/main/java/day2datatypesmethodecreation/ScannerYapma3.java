package day2datatypesmethodecreation;

import java.util.Scanner;

public class ScannerYapma3 {

    public static void main(String[] args) {

        //Kullanicidan bir kelime isteyiniz
        // 2. harfini yazdiriniz.
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");

        char ikinciHarf = scan.next().charAt(1);

        System.out.println("Girilen kelimenin ikinci harfi="+ikinciHarf);

        //Java da String icerisindeki kelimeler index ile tutulur.
        //Ornegin kullnici Ali yazarsa;
        //A- 0.index, l- 1.index, l - 2.index

        //scanner class da scan.nextChar() yoktur.
        // Bunun yerine scan.next() kullaip, kullanicinin girdigi ilk kelimeyi alip
        //sonra charAt() kullanarak hangi indexi istiyorsak onu aliriz.



    }
}
