package day10homework;

import java.util.Scanner;

public class AySayisiIsmiHomeWork {
    public static void main(String[] args) {
        //3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
        //    1==>January , 2==> February

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 12 arasi bir numara giriniz");
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("January");
        } else if (num == 2) {
            System.out.println("February");

        } else if (num == 3) {
            System.out.println("March");

        } else if (num == 4) {
            System.out.println("April");

        } else if (num == 5) {
            System.out.println("May");

        } else if (num == 6) {
            System.out.println("June");

        } else if (num == 7) {
            System.out.println("July");

        } else if (num == 8) {
            System.out.println("August");

        } else if (num == 9) {
            System.out.println("September");

        } else if (num == 10) {
            System.out.println("Oktober");

        } else if (num == 11) {
            System.out.println("November");

        } else if (num == 12) {
            System.out.println("December");

        } else {
            System.out.println("enter valid nummer");

        }


    }
}
