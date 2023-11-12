public class Calculator {
    public int Collect(int... numbers){
        int toplam = 0;
        for(int number : numbers){
            toplam += number;
        }
        return toplam;
    }
}
