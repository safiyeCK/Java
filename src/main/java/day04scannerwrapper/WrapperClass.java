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

        //Örnek 1: Short data type'ının minimum ve maximum değerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        // ornek 2; int data typenin min degeri ile byte data typenin max degerleri toplamini bulunuz.

        int minInteger = Integer.MIN_VALUE;

        byte maxByte = Byte.MAX_VALUE;

        System.out.println( minInteger+maxByte);

        //ornek 3: Primitive int i wrapper Integer a ceviriniz. (once bir pirimitive data aldik sonra Wrapper claas dan
        //Integer a cevirdik buna AutoBoxing denir.(primitivi Wrapper a cevriemeye denir)

        int num = 19;
        Integer wrapperNam = num;

        //ornek 4: Wrapper Byte primitive byte ceviriniz. ( Wrapper  i tekrar primitive cevirmeye UnBoxing denir)

        Byte k = 19;

        byte primitiveK = k;


        // ornek5: Primitive char i wrapper Character e ceviriniz.(AutoBoxing)

        char initial = 'T';

        Character initalWrapper = initial;



        // Wrapper Boolen e primitive boolean a cevir.(UNBoxing)
        Boolean yasliMi= true;

        boolean isOld = yasliMi;





    }
}
