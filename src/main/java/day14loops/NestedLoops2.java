package day14loops;

import java.util.Scanner;

public class NestedLoops2 {
    public static void main(String[] args) {
            /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir(row)sayisini giriniz");
        int row = input.nextInt();
        System.out.println("Sutun(column) sayisini giriniz");
        int colmn = input.nextInt();

        for (int i = 1; i <= row; i++) { // distaki loop satirlar icin satir sayisi kadar calisir


            for (int j = 1; j <= colmn; j++) {// yanyana yazdiginda surunlar icin sutun sayisi kadar calsir
                System.out.print("x ");

            }
            System.out.println(); // satir yanyana yazdirildiktan sonra pointere bir sonraki satira almak icin kullanilir.
        }


        //Kullanicidan veri almadan yaparsak
        int satir = 3;
        int sutun = 5;
        for (int i = 0; i < satir; i++) {
            for (int e = 0; e < sutun; e++) {
                System.out.print("x ");
            }
            System.out.println();
        }

    }

}
