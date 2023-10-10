
    /* Java tip güvenli bir dildir. */

public class Main {
    public static void main(String[] args) {

        /* Ekrana çıktı basar. */
        System.out.println("Hello and welcome!");

        /* int sayı tanımlama */
        int studentNumber = 10;

        /* + işareti ile değişkenler ekrana basılır */
        System.out.println("Student Number : " + studentNumber);

        /* String tanımlama */
        String message = "Student Number : ";
        System.out.println(message + studentNumber);
        /* if else - şart yapsısı */
        if(studentNumber > 10){
            System.out.println("Siz G101 sınıfına gideceksiniz");
        }
        else if(studentNumber >= 10 && studentNumber < 270){
            System.out.println("Siz G102 sınıfına gideceksiniz");
        }
        else{
            System.out.println("Lütfen kaydınızı düzgün yapınız!");
        }
        /* Class newleme ve Örnek Soru */
        Demo1 demo = new Demo1();
        demo.Compare();

        /* switch yapısı */
        char grade = 'A';

        switch(grade){
            case 'A':
                System.out.println("Mükemmel Öğrenci!");
                break;
            /* Bu şekilde kullanım aynı çıktıyı verir. */
            case 'B':
            case 'C':
                System.out.println("Biraz daha çalış");
                break;
            /* Hiç bir case'e uymaz ise ilgili aşr o zaman buraya girecektir */
            default:
                System.out.println("Kaldınız");
        }

        //Döngüler
        //For Döngüsü
        for (int i = 0; i < 11;i++)
            System.out.println("i değeri : "+i);
        for (int j = 60; j > 50; j-- ){
            System.out.println("J değeri : " + j);
            j--;
        }
        //While
        int x = 1;
        while(x < 100){
            x = (x * 2) + 1;
            if(x % 17 == 0)
                System.out.println("x 17'nin tam katı!");
            System.out.println("x : " + x);
        }
        // do-While
        System.out.println("--------------");
        do{
           x = x / 2;
           System.out.println("x : "+ x);
        } while(x < 100 && x != 0);

        //for-each
        String[] isimler = {"Tahir" , "Sadık","Ahmet","Erdem","Gökay","Maldonada","Ronaldo","Messi"};

        for(String data : isimler){
            System.out.println(data);
        }


        //   Diziler
        String[] personels = new String[5];
        int[] studentNumbers = new int[10];

        System.out.println("Öğrencilerin sayısı :" + studentNumbers.length);


        //Demo2
        Demo2 d2 = new Demo2();
        d2.SumNumbers();
        d2.FindMax(d2.floatNumbers);

        // Çok Boyutlu Diziler - Matrisler
        String[][] names = new String[3][5];
        for (int i = 0; i < 3; i++){
          for (int j = 0; j < 5;j++){
              names[i][j] = "name" + i + "" + j;
          }
        }
        for(String[] data1 : names ){
            for(String data2 : data1){
                System.out.print(data2 + "\t");
            }
            System.out.println();
        }
    }
}

class Demo1{
    int sayi1 = 200,sayi2= 37,sayi3 = 40;
    String s1 = "En büyük sayi : ",s2 = "İkinci en büyük sayi :",s3 = "En küçük sayi :";
    /* Verilen sayıları karşılaştıran bir algoritma */
    void Compare(){
        if(sayi1 > sayi2){
          if(sayi1 > sayi3) {
              System.out.println( s1 + sayi1);
              if(sayi2> sayi3){
                  System.out.println(s2 +sayi2);
                  System.out.println(s3 +sayi3);
              }
              else{
                  System.out.println(s2 +sayi3);
                  System.out.println(s3 +sayi2);
              }
          }
          else {
              System.out.println(s1 + sayi3);
              System.out.println(s2 + sayi1);
              System.out.println(s3 + sayi2);
          }
        }
        else if(sayi2 > sayi3){
            System.out.println(s1 + sayi2);
            if(sayi1 > sayi3){
                System.out.println(s2 + sayi1);
                System.out.println(s3 + sayi3);
            }
            else{
                System.out.println(s2 + sayi3);
                System.out.println(s3 + sayi1);
            }
        }
        else{
            System.out.println(s1 + sayi3);
            System.out.println(s2 + sayi2);
            System.out.println(s3 + sayi1);
        }
    }
}

class Demo2{
    double[] floatNumbers = {1.2,1.24,1.54,2.34,3.21,4.3};
    double total = 0;
    void SumNumbers(){
        for(double data : floatNumbers){
            total += data;
        }
        System.out.println("İlgili dizideki sayıların toplamı : " + total);
    }
    void FindMax(double[] _x){
        double maxNumber = _x[0];
        for(double data : _x){
            if(data >maxNumber)
                maxNumber = data;
        }
        System.out.println("Max number : " + maxNumber);
    }
}
