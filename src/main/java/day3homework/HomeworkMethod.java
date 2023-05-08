package day3homework;

public class HomeworkMethod {

    public static void main(String[] args) {

        // 1) cemberin cevresini hesaplayan methodu olustur ve kullaniniz
        // 2) Dairenin alanini hesaplayan methode olusturunuz ve kullaniniz



        double sonucAlan= daireAlan(5, 3.14);
        System.out.println("Alan = " + sonucAlan);

        double sonucCevre = cemberCevre(5 ,3.14);

        System.out.println("Cevre = " + sonucCevre);
    }
    public static double daireAlan( double r ,  double π){

        return π*r;
    }
    public static double cemberCevre( double r ,double π) {return (π*2*r);
    }
}
