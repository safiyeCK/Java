package day18multidimensionalarray;

public class Mdo2Tekrar {
    public static void main(String[] args) {
        //String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        // Ornek : Yukaridaki students arrayinde icinde "m" olan isimleri console a yazdiriniz

        String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        for (String[] w:students
             ) {
            for (String k:w
                 ) { if(k.contains("m")){
                System.out.println(k);
            }

            }

        }

        //2. kes daha coz icinde "n" harfi olanlari yazdir
        String names [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        for (String[] w:names
             ) {
            for (String s:w
                 ) { if(s.contains("n")){
                System.out.println(s);
            }
                
            }
            
        }
        
        





// Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.

        // Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesap

        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int sum=1;
        for (int[] w:nums
             ) {
            for (int f:w
                 ) {sum=sum*f;

            }

        }
        System.out.println(sum); //1680
    }
}
