package day16arraysforeacloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek1: int bir array olusturunuz. Icine 6 tane eleman yerlestiriniz.
        // Bu elemanlardan en kucugu ile en buyugu nun toplamini ekrana yazdiriniz
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));

        //1.yol
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages)); //[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0] + ages[ages.length - 1]); //59


        int minumum = ages[0];

        for (int w : ages) {
            minumum = Math.min(minumum, w);
        }
        System.out.println(minumum); //15

        int max = ages[0];
        for (int w : ages) {
            max = Math.max(max, w);
        }
        System.out.println(max); //44

        System.out.println("toplam=" + (max + minumum));


        //Ornek 2: String bir array olusturunuz,6 ekeman ekleyiniz. yellow dan onceki elemani yazdiriniz
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors)); //[Red, Orange, Blue, Yellow, Green, Brown]

        for (String w : colors) {

            if (w.equals("Yellow")) {
                break;
            }
            System.out.println(w);
        }


    }

    }


