package day10homework;

import java.util.Scanner;

public class BirinciOdevHaftalarIfElse {

    public static void main(String[] args) {
        // 2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        //Pazar ==> 1. gun , Pazartes ==> 2. gun...

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String dayName = scan.next();

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("1.Gun");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("2.Gun");
        } else if (dayName.equalsIgnoreCase("Thuesday")) {
            System.out.println("3.Gun");

        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("4.Gun");

        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("5.Gun");

        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("6.Gun");

        } else if (dayName.equalsIgnoreCase("Sturday")) {
            System.out.println("7.Gun");

        } else {
            System.out.println("Hatali giris yaptiniz.Lutfen bir gun adi giriniz");
        }

    }
}
