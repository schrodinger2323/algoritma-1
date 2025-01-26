package algo1;

//-100+200+(2/5)+(5/8)+(8/11)+... ilk 50 eleman toplami
public class NewClass22 {

    public static void main(String[] args) {

        double toplam = (-100 + 200);
        for (double i = 2; i <= 143; i += 3) {
            toplam = toplam + (i / (i + 3));
        }
        System.out.println(toplam);
    }

}
