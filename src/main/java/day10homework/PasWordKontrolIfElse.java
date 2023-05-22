package day10homework;

import java.util.Scanner;

public class PasWordKontrolIfElse {
    public static void main(String[] args) {

        //)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        //    uygun mesaj veren kodu yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen paswordunuzu giriniz");
        String str=scan.next();

        if (str.equals("pwd123!")){
            System.out.println("Correct answer");}

        else {
            System.out.println("Invalid pasword");}
    }
}
