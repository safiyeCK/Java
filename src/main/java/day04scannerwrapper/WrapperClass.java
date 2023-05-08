package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {


        //primitive: char, boolean, byte, int, short, long, float, double
        //Wrapper Class: Character, Boolean, Byte, Integer, Short, Long, Float, Double

        //Wrapper Class'lar non-primitive'dir. O yüzden memory'de çok yer kaplarlar
        //Dolayısıyla şart değilse wrapper class kullanmayı tercih etmeyiz ama böyle bir imkanın varlığından haberdar olmalıyız


        //n yazıp nokta koyarsanız hiç method göremezsiniz çünkü primitive'ler method içermez
        int n = 12;

        //m yazıp nokta koyarsanız bir çok method görebilirsiniz çünkü Wrapper Class'lar method içerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Örnek: Short data type'ının minimum ve maximum değerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;


    }
}
