package algo1;

import java.util.Scanner;

//klavyeden girilen 4 basamakli sayinin rakamlarini toplayan pr.

public class NewClass19 {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        int sayi1 = k.nextInt();
        int binler = sayi1 / 1000;
        sayi1 = sayi1 % 1000;
        int yuzler = sayi1 / 100;
        sayi1 = sayi1 % 100;
        int onlar = sayi1 / 10;
        sayi1 = sayi1 % 10;
        int birler = sayi1;
        int toplam = binler + onlar + yuzler + birler;
        System.out.println(toplam);
    }
}
