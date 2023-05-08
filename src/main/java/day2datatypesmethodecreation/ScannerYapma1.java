package day2datatypesmethodecreation;

import java.util.Scanner;

public class ScannerYapma1 {

    public static void main(String[] args) {


        //Kullanicidan bilgi alip yazdirma

        //1.Adim- scanner olustur.

        Scanner scan = new Scanner(System.in);

        //2.Adim- Kullaniciyaz ne istediginizi soyleyiniz.

        System.out.println("Lutfen isminizi giriniz");

        // 3. Adim= scan objesini kullanarak, kullanicidan bilgiyi alip,
        //olusturacaginiz uygun variable 'a kaydediniz.

        String kullaniciIsmi= scan.nextLine();

        //next() methodu sadece ilk space kadar metni alirken,
        //nextln() tum satiri alir


        System.out.println("Girilen kullanici ismi="+ kullaniciIsmi);

    }
}
