package day17arrays;

import java.util.Arrays;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //ornek= Verilen bir array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int arr[]={2,63,313,8,7,100,4};
        System.out.println(Arrays.toString(arr));

        int counter=0;
        for (int w:arr
             ) {if(w%2==0){
                 counter++;
        }

        }
        System.out.println(" Array de + " + counter + " adet cift sayi " + (arr.length-counter) + " tek sayi vardir");



        //ORNEK
        int nummer[]={1,2,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(nummer));

        int counter1=0;
        for (int w:nummer
             ) { if(w%2==0){
                 counter1++;
        }
        }
        System.out.println(" Array de " + counter1 + " adet cift sayi " + (nummer.length-counter1) + " tek sayi vardir");





        //ornek= Verilen bir array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayi[]={12,34,56,78,0,11};
        System.out.println(Arrays.toString(sayi));
        int ind= 0;
        for (int w:sayi
             ) { if (w%2==0) {
                 ind++;
        }
        }
        System.out.println("Arraydeki cift sayilar " + ind +
                "tanedir" + " tek sayilar ise " + ( sayi.length-ind));
        }

    }



