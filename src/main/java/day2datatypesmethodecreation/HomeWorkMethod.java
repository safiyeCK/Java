package day2datatypesmethodecreation;

public class HomeWorkMethod {

    public static void main(String[] args) {

        int sonucAlan= dikdortgeninAlani(5,6);

        System.out.println(sonucAlan);

        int sonucCevre= dikdortgeninCevresi(5,6);

        System.out.println(sonucCevre);

        int sonucUcgenAlan = ucgenAlan(5,6);

        System.out.println("ucgenin Alani="+ sonucUcgenAlan);

        int sonucUcgeninCevresi = ucgeninCevresi(4,5,7);

        System.out.println("Ucgenin Cevresi="+ sonucUcgeninCevresi);

    }

    // Dikdortgenin alanini hesaplayan methodu olusturup, kullanin

    public static int dikdortgeninAlani ( int a, int b){

        return(a*b);
    }
//Dikdortgenin cevresini hesaplayan metodu olusturup, kullanin

    public static int dikdortgeninCevresi (int a, int b){
        return (a*2)+(b*2);
    }


    // Ucgenin cevresini ve alanini hesaplayan methodu olustup, yazdiriniz

    public static int ucgenAlan(int a, int h){
        return (a*h)/2;

    }

    public static int ucgeninCevresi (int a, int b, int c){
        return (a+b+c);
    }
}
