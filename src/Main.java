
    /* Java tip güvenli bir dildir. */

public class Main {
    static {
        System.out.println("ilk");
    }
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

        //Strings
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        // 4. indeksteki karakteri ekrana yazdırır.
        System.out.println("5. eleman : " + mesaj.charAt(4));
        // ligili stringin sonuna ekleme yapar.
        System.out.println(mesaj.concat("Dışarı çıkalım mı?"));
        System.out.println(mesaj.startsWith("B"));


        //Mini Projeler
        int[] dizi = new int[] {5,10,12,43,52,72,100};
        Demo3 d3 = new Demo3();
        System.out.println(d3.IsAsal(1));
        System.out.println(d3.IsPerfectNumber(8128));
        System.out.println(d3.Find(dizi,12));

        //Sadık

        Sadık sadık=new Sadık(2);
        System.out.println("SADIK 2 NESENESI URETILIYOR");
        sadık2 sadık2a=new sadık2();

        System.out.println(sadık.sadik);

        // Enums
        enum Gunler {
            Pazartesi,
            Salı,
            Çarşamba,
            Perşembe,
            Cuma,
            Cumartesi,
            Pazar;

            public boolean isÇalışmaGünüdür() {
                return this != Cumartesi && this != Pazar;
            }
            }
        Gunler gun = Gunler.Cumartesi;
        gun.isÇalışmaGünüdür();


         Mevsim.IsMevsim("ilkbahar").Print();
         for(Mevsim m : Mevsim.values()){
             System.out.println(m.Id());
         }
         //Classes
         int a = 3;

         Calculator calculator1 = new Calculator();
         System.out.println(calculator1.Collect(1,5,90,23,45,43,21,10));



    }
}

    class Sadık implements IDeneme
    {
        public  Sadık()
        {
            System.out.println("Sadık sınıfı olusturuldu");
        }
        public Sadık(int a)
        {
            this();
            System.out.println("Sadık sınıfının 2. ctorudur degeri"+a);
        }
        public int deger;


        @Override
        public int Yumruk(int a){
            return a;
        }
    }
    class sadık2 extends Sadık
    {
        public  String deneme;
        public  sadık2()
        {
            System.out.println("SADIK2 INIFI OLUSTURULDU");
        }
    }

    interface IDeneme
    {
        int Yumruk(int a);
        int sadik = 10;
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

class Demo3{
    
    public boolean IsAsal(int _number){
        //Döngü değişkeni
        int i;
        if(_number == 2)
            return true;
        else if(_number < 0){
            return false;
        }
        else{
            // Sayının kendisine gelene kadar bölme işlemi yapar ve eğer tam bölebilirse asal olmadığı anlaşılır.
            for(i = 2; i < _number &&  _number % i != 0;i++);
            // Sayı döngüden çıktıktan eğer bölünmemişse numbera eşit olmalı.
            if(i == _number) return true;
        }
        return false;

    }
    //mükemmel sayı : bölenleri toplamı kendisini veren sayıdır.
    public boolean IsPerfectNumber(int _number){

        int total = 0;
        if(IsAsal(_number)) return false;
        for (int i = 1; i < _number; i++){
            if(_number % i == 0) total += i;
        }
        if(total == _number) return true;
        return false;
    }
    public int Find(int[] numbers , int finded){

        int i = 0,j = numbers.length, pivot;
        while(i < j){
            pivot = (( j - i ) / 2) + i;
            if(numbers[pivot] == finded) return pivot;
            else if(numbers[pivot] < finded){
               i = pivot;
            }
            else{
                j = pivot;
            }
        }

        return -1;
    }
}
class StatikDeneme{
    static {
        System.out.println("Static bloğumuz (Deneme)");
    }
}