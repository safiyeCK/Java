package day3homework;

import java.util.Scanner;

public class ScannerHomework1 {
    public static void main(String[] args) {

        // Lutfen kullanicindan dairenin yaricapini alip, dairenin alanini hesaplayip yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz");
        double girilenYaricap= scan.nextDouble();
        double daireninAlani= 3.14* girilenYaricap*girilenYaricap;

        System.out.println("Dairenin Alani:"+ daireninAlani);
    }
}
