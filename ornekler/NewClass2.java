package javaapplication18;

import java.util.Scanner;

//girilen sayiya kadarki sayilari 1 2 2 3 3 3 seklinde yazdiran ve toplayan pr.
public class NewClass2 {

    public static void main(String[] args) {

        int toplam = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = k.nextInt();
        for (int i = 0; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                toplam = toplam + i;
                System.out.print(i + " ");
            }

        }
        System.out.println("\ntoplam= " + toplam);
    }
}
