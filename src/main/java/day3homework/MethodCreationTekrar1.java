package day3homework;

public class MethodCreationTekrar1 {

    public static void main(String[] args) {

        print("Java candir");

        yazdir("Saha fazla uyumaya ihtiyacim var");

        print1("Bugun hava cok guzel");

        print2 ("Buyun agaclar cicek acti ve her yer yesillendi");

        printConsole("Yarin mutlaka gelmelisin");

    }



    //konsola birsey yazdir.
    public static void print(String str) {
        System.out.println(str);

    }


    public static void yazdir(String str1){
        System.out.println(str1);
    }

    private static void print1( String str2){
        System.out.println(str2);
    }

    public static void print2 (String str3){
        System.out.println(str3);
    }

    public static void printConsole( String str4){
        System.out.println(str4);
    }
}
