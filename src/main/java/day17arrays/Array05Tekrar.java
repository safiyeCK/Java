package day17arrays;

import java.util.Arrays;

public class Array05Tekrar {
    public static void main(String[] args) {
        //Example 1: [7, 2, 3, 7, 12, 7] sifirlari en sona koyunuz  [2, 3, 12, 7, 7, 7]
//7 leri sona yazdiran kodu yaziniz.

        int a[]= {7, 2, 3, 7, 12, 7};
        int b[]=new int[a.length];
        int idxIlk =0;
        int idxSon =a.length-1;
        for (int w:a) {
            if(w!=7){
                b[idxIlk]=w;
                idxIlk++;
            } else if (w==7) {
                b[idxSon]=w;
                idxSon--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
