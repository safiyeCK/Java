package ornekcozumifenternaty;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi aliniz ve buyuk olmayani yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        
        double result= sayi1<sayi2?sayi1:sayi2;
        System.out.println("result = " + result);

        //Kullanicidan bir tam sayi alin ve sayinin tek mi cift mi oladugunu yazdirin.

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int num= input.nextInt();
        String sonuc= num%2==0?"cift":"tek";
        System.out.println("sonuc = " + sonuc);






    }
}
