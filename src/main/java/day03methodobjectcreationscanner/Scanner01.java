package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {


          /*
    Java da bir çok library var bunlarda biri util library dır.
     Scanner Class burda bir class olup kullanıcıdan data alıp kodlarımızda kullanmayı sağlar
     */

            // 1. adım Scanner Class tan object oluştur.


            Scanner input = new Scanner (System.in);


            // 2. adım kullanıcıya ne istediğinize dair mesaj veriniz.


            System.out.println("Lütfen yasinizi giriniz");

            // 3. adım Uygun methodu kullanarak kullanıcının verdiği datayi memory e yerleştiriniz.


            byte age = input.nextByte();
            System.out.println("age = " + age);


    }
}



