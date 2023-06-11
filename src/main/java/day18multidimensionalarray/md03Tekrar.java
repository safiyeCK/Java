package day18multidimensionalarray;

import java.util.Arrays;

public class md03Tekrar {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e cevriniz.
        // 1.iki boyutlunun eleman sayisini bul
        //yeni tek boyutlu aary olustur
        //2 boyutlunun elemanlarini tek boyutluya at
        int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}
        int elemanSayisiToplami=0;
        for (int[]w:numbers
             ) {elemanSayisiToplami=elemanSayisiToplami+w.length;

        }
        System.out.println(elemanSayisiToplami); //5
        int [] newArr= new int[elemanSayisiToplami];

        int index=0;
        for (int []w : numbers) {
            for (int f:w
                 ) {newArr[index]=f;
                index ++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
    }
}
