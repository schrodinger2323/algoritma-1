package algo1;

public class NewClass21 {
    //-5+(3/5)+(5/7)+(7/9)... ilk 10 eleman toplami

    public static void main(String[] args) {

        double toplam = -5;
        for (double m = 3; m <= 19; m += 2) {
            toplam = toplam + (m / (m + 2));
        }
        System.out.println(toplam);
    }
}
