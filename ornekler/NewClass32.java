package algo1;

import java.util.Scanner;

public class NewClass32 {

    public static void main(String[] args) {
        //klavyeden girilen sayiya kadar olan asal sayilari ekrana yazdirma
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = k.nextInt();
        if (sayi < 2) {
            System.out.println("2den kucuk asal sayi yoktur tekrar giriniz");
        }
        boolean kontrol = true;
        while (sayi >= 2) {
            kontrol = true;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.println(sayi + "bir asal sayidir");
            }
            sayi--;
        }
    }
}
