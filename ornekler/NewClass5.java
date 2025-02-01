package algo1;

import java.util.Scanner;

public class NewClass5 {

    public static void main(String[] args) {
        //klavyeden girilen sayilari topla 0 girince toplamı ekrana yazdır, programdan cik
        //for dongusu ile
        Scanner k = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int toplam = 0;
        for (;;) {
            int x = k.nextInt();
            if (x == 0) {
                System.out.println("0 girdiniz programdan ciktiniz");
                System.out.println("toplam= " + toplam);
                System.exit(1);

            }
            toplam = toplam + x;
        }
    }
}
