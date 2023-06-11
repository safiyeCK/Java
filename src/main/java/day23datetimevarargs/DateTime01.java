package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input= new Scanner(System.in);
        System.out.println("Palease enter year,moth and day numbers in the given orde");
        int year =input.nextInt();
        int month =input.nextInt();
        int day =input.nextInt();

       LocalDate givenDate= LocalDate.of(year,month,day);

       if (givenDate.isBefore(LocalDate.now())){ // localdate.now her zaman o anki tarihi verir.
           System.out.println(givenDate + "invalid");

       }else{
           System.out.println("Enter time for ticket");
       }

       //Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Palease enter year,moth and day numbers in the given orde");
        int y =input.nextInt();
        int m =input.nextInt();
        int d =input.nextInt();
        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());


    }
}
