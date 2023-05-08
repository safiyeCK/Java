package day04scannerwrapper;

import java.util.Scanner;

public class ScannerHomework {

    public static void main(String[] args) {
        // 6 basamakli bir tam sayi aliniz ve son iki ve ilk iki rakamini toplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("4 basamakli bir tam sayi aliniz");
        int number = input.nextInt();

        // son  rakami al
        int birlerBasamagi= number%10;
        // sayiyi kucult
        number =number/10;

        //sondan 2. rakami al
        int sondanIkinci = number%10;
        //Sayiyi kuucult
        number= number/10;

        //sondan 3.rakami al
        int sondanUcuncu= number%10;
        // sayiyi kucult
        number= number/10;

        // sondan 4. rakami al
        int sondanDorduncu= number%10;

        System.out.println(birlerBasamagi+sondanDorduncu);







    }
}
