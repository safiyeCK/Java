package day05concatinationoperatortypecasting;

public class WrapperHomework {
    public static void main(String[] args) {

        //PMD = char, boolean, byte, short, int, long, float, double
        //Wrapper Class= Character, Boolean, Byte, Short, Integer, Long. Float, Double
        // not1- Wrapper Class lar nonPMD dir ve mamory de fazla yer kaplar.
        // not2- lazim degilse kullanma

        int a = 12; // PMD (method yok)
        Integer n = 12; // n. yazdigimda bir suru method gorursun
 //*****************************************************************************
        //Bir data type nin degerini bul

        int intMax= Integer.MAX_VALUE;
        System.out.println(intMax); //2147473647
        int intMin = Integer.MIN_VALUE;//-2417473647
        System.out.println(intMin);
        System.out.println(intMax+intMin);// -1

        // ornek1: short max ve long min degeri toplayalim.

        short shortMax = Short.MAX_VALUE;
        long longMin= Long.MIN_VALUE;
        System.out.println(shortMax+longMin);

         //***************************************************************************
        //PMD yi Wrapper class a cevir
        // Wrapper Clas i PMD cevir.

        int num= 12;
        Integer wrapperNum= num;  // AUTOBOXING

        Byte b= 19;
        byte pirimitiveByte= b; // UNBOXING












    }
}
