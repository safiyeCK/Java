package day22arraylistsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01Tekrar {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);  //2023-06-10

        System.out.println(tarih.getMonthValue()); //6

        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime); //19:24:52.486538700

    }
}
