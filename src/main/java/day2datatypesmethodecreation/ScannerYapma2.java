package day2datatypesmethodecreation;

import java.util.Scanner;

public class ScannerYapma2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //Kullanicidan dairenin yaricapini alip, alanini hesaplayip
        //yazdirin

        System.out.println("Lutfen dairenin yaricapini giriniz");

        double yariCap = scan.nextDouble();

        double daireninAlani= 3.14*yariCap*yariCap;

        //alani hesaplayin ve yazdirin

        System.out.println("Dairenin alani="+ daireninAlani);


    }
}
