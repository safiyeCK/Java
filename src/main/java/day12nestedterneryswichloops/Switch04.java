package day12nestedterneryswichloops;

import java.util.Scanner;

public class Switch04  {
    public static void main(String[] args) {


        /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN BİR ÜLKE ADI GİRİNİZ");
        String ad = input.next();

        switch (ad){
            case "America":
                System.out.println("US");
                break;
            case "England":
                System.out.println("UK");
                break;
            case "Germany":
                System.out.println("DE");
                break;
            case "Turkey":
                System.out.println("TR");
                break;
            case "India":
                System.out.println("IN");
                break;
            case "Peru":
                System.out.println("PE");
                break;
            case "Spain":
                System.out.println("ES");
                break;
            case "Bulgaria":
                System.out.println("BG");
                break;
            case "Albania":
                System.out.println("AL");
                break;
            case "France":
                System.out.println("FR");
                break;

            default:
                System.out.println("LÜTFEN GEÇERLİ ÜLKE ADI GİRİNİZ");
        }

    }
}


