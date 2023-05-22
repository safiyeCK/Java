package day09ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        // Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!"

        int number = 123;

        if (number >99 && number<1000){
            System.out.println("Sayi uc basamaklidir!");}


        int number1 = 12;
        if (number1 >99 && number1<1000){
            System.out.println("Sayi uc basamaklidir!");} // false olur,( olumsuz ornek if e  )ve hic birsey goremezsin konsolda

        // math methodunu kullanirsak -123 degerini de ya da diger degerleri de calistirir.

        int number2 = -123;

        number2= Math.abs(number2); // Math abs methodu mutlak degeri alir. math absuluut dan gelir.

        //ornek 2) bir stingdeki tekrarsiz karakterleri ekrana yazdirinz.Yani 1 kere yazilani alacagiz
        // abbccda ==> ad alicaz


        if (number2 >99 && number2<1000){
            System.out.println("Sayi uc basamaklidir!");}

        //Ornek 2: Bir String deki tekrarsiz characterleri ekrana yazdiriniz
        //       abbccdc  ==> ad

        String str = "aac";

        char ch1 = str.charAt(0);

        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);


        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);


        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }








    }









}
