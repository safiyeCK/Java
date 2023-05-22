package day05concatinationoperatortypecasting;

public class Day05HomeworkOperator {
    public static void main(String[] args) {

        // +, - , * , /  bunlar matematikteki gibi kullanilir.
        //int/int = int yani tamsayi /tamsayi= tamsayi dir.

        //double + int = double ( java buyuk olana gore islem yapar)

        //***LOGICAL OPERATORLER

        //*** AND ve OR

        //* AND(&& veya &)Tek olan hepsine bakar, cift olan ilk hatayi bulunca sonuc verir
        // 1- islemin true olmasi icin butun islemler true olmali
        //* AND 2-perfectionist tir
        //* AND 3- Bir tane false olsa sonuc false dir.

        //# OR (||)
        // 1-Bir tane true sonucu true etmeye yeter.
        // ( !) isareti varsa, operator true olani false ; false olani true yapar.
        // !True => false
        // !false=> true
        // ! true =>true


        // *** COMPARISON OPERATORLER (karsilastirma)
        // >
        // <
        // <=       Bunlar karsilastirma sembolleri ve BOOLEAN kullanirizi( true of false)
        // >=
        // ==
        // !=

        //ORNEK

        boolean first = 3<5 ; // True

        boolean second = 2+ 3 != 5; // False

        boolean third = 2 + 3 * 5 >= 19 ; // false

        System.out.println(first +"-" + second + "-" + third ); // true- false- false

        System.out.println(first && second); // false

        System.out.println(first || second || third); // True




    }

}
