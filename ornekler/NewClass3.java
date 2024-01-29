package yanlismidogrumu;

import java.util.Scanner;
//klavyeden girilen sayinin 20den buyuk mu, kucuk mu, esit mi 
//oldugunu ekrana yazan program
public class NewClass3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = read.nextInt();
        if (sayi < 20) {
            System.out.println("sayi 20den kucuktur");
        } else if (sayi == 20) {
            System.out.println("sayi 20ye esittir");
        }
        if (sayi > 20) {
            System.out.println("sayi 20den buyuktur");
        }

    }
}
