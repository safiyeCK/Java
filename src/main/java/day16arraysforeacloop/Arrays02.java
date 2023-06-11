package day16arraysforeacloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: String aray olusturun. icine 5 eleman ekleyin, ilk eleman ile
        // /son elemanin icerdigi sayilari toplamini ekrana yazdirin.

        String arr[]= new String[5];
        arr[0]="Math";
        arr[1]="Sience";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));

        System.out.println( arr[0].length()+ arr[arr.length-1].length());

        //array den specifik eleman almak icin index sayisini aliriz ve length ile de karakter sayisini aliriz.
        // son index length -1 ile alinir

        //Ornek 2: String bir array olustrurun , icine 5 tane elamn ekleyin,
        //Tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin. (tum elemanlari toplayacagimiz icin
        //bos bir int data olusturmamiz lazim)

        String brr[]= new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        //1.yol
        int totalChar=0;

        for (int i = 0; i <brr.length ; i++) {
           totalChar=totalChar+brr[i].length();

        }
        System.out.println(totalChar);

        //2.yol for each loop(enhanced loop(zenginlestirilmis))FOR EACH LOOP
        // baslangic degeri, loopen calisma sarti ve increment/decrement kismini kendisi halleder.
        // for each loop "Array"lerde ve "collection " larda kullanilir.
        //Java collection ve Arraylere ozel for each loop olusturmus.Hata payi cok az
         // Egerki Array ve collection ile calisyorsak ilk tercih For each Loop olmalidir

       // for (Datatype variableName(istedigin ismi yazabilirsin.Fakat variable name olarak w ullanilir.) :  aar/collection){calisacak kodlar}
        // for(Datatype w: arr/collection){caliscak kodlar}

        int sum=0;
        for (String w: brr){
            sum=sum+w.length();
        }
        System.out.println(sum);  //30

        //Ornek 3: notlar adinda int bir array oliusturunuz ve not ortalamasini ekrana yazdiriniz.

        int notlar[]= new int[6]; //(memory de icinde intger tutan bir array olusturduk)
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar)); // 50,70,60, 40, 90,80 array arena da yazdirilmis haline baktik

        int toplam=0;
        for (int w:notlar){
           toplam= toplam+w;
        }
        System.out.println(toplam/ notlar.length);




    }}

