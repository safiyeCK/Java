package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrayleri kisa yoldan nasil olusturuz.
        int arr[] = {2, 63, 313, 8, 7, 100, 4};
        System.out.println(Arrays.toString(arr));


        //ornek= Verilen bir array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int counter = 0;

        for (int w : arr) { // arr sepetimizdeki elemanlar tek tek w ye gelir.
            if (w % 2 == 0) {
                counter++;
            }

        }

        System.out.println(" Array de " + counter + " adet cift sayi " + (arr.length - counter) + " adet tek sayi kullanilmistir ");

        //ornek 2=Size verilen bir String arraydeki isimlerden 5 character de az character icerenleri consola yazidiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }


        //Ornek 3=Size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimler haric diger isimleri consola yazidriniz

        //Note sort() mertodu sayisal data tplelari kucukten buyuge siralar .(ascending order)
        //Note sort() methodu String data typelari alfabetik olarak siralar.(alphabetic order)
        //Note 3 (ascending order)  +(alphabetic order) =Natural order
        //Note 4 sort() methodu array elemanlarini (Natural order) a gore siralar.


        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));  //[Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for (String w : stdNames
        ) {
            if (w.startsWith("F")) {
                continue; // F gelince continue calisir ve yoluna devam edip diger isme gecer.Asagiya devam edemez ve yazdirilmaz.
            }
            System.out.println(w);
        }




    }
}
