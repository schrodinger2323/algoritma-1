package algo1;

import java.util.Scanner;

public class NewClass31 {

    public static void main(String[] args) {
        //klavyeden girilen sayinin asal olup olmadigini gosteren
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayi griniz");
        int sayi = k.nextInt();
        boolean asal = true;
        if (sayi == 0 || sayi < 0) {
            System.out.println("lutfen 0 veya negatif deger girmeyin");
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }
        if (asal == true) {
            System.out.println("sayi asal sayidir");
        } else {
            System.out.println("sayi asal sayi degildir");
        }
    }
}
