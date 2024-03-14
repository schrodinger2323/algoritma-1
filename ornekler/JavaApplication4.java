package javaapplication4;

import java.util.Scanner;

//klavyeden girilen 4 basamakli sayinin basamaklarini ekrana yazan pr.
public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        int sayi1 = read.nextInt();
        int binler, yuzler, onlar, birler;
        binler = sayi1 / 1000;
        sayi1 = sayi1 % 1000;
        yuzler = sayi1 / 100;
        sayi1 = sayi1 % 100;
        onlar = sayi1 / 10;
        sayi1 = sayi1 % 10;
        birler = sayi1;
        System.out.println("Birler basamagi=" + birler);
        System.out.println("Onlar basamagi=" + onlar);
        System.out.println("Yuzler basamagi=" + yuzler);
        System.out.println("Binler basamagi=" + binler);

    }

}
