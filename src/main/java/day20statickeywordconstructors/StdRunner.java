package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {




        System.out.println(Student.stdName);//stdName static oldugu icin ona ulasmak icin obje olusturmadik.
        //sedece class name yeterli. sout la yazdirmana gerek yok

        Student std1=new Student();//age non- static oldugu icin ona ulasmak icin obje olusturduk
        System.out.println(std1.age);
        //veya 2. kez
        Student std2=new Student();
        System.out.println(std2);

        Student.staticMedhod();
        std2.nonStaticMethod(); // diger class da yazdirdik o yuzden buarda direk yazar

        System.out.println(std1.stdName); //object uzerinden de static class nember lara ulasabilirz
        //fakat bu tavsiye edilmes
    }
}
