package algo1;

import java.util.Scanner;
//klavyeden girilen 10 sayinin toplami

public class NewClass2 {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("10 sayi giriniz");
        double toplam = 0;
        for (int i = 0; i < 10; i++) {
            double x = k.nextDouble();
            toplam = toplam + x;
        }
        System.out.println("toplam= " + toplam);
    }
}
