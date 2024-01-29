package week3;

import java.util.Scanner;

//klavyeden girilen 5 sayinin toplamini ekrana yazan program
//while dongusu ile
public class ornek2 {

    public static void main(String[] args) {
        int sayi, toplam = 0;
        int sayac = 1;
        Scanner oku = new Scanner(System.in);
        while (sayac < 6) {

            System.out.println(sayac + ". sayiyi giriniz");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
            sayac++;
        }
        System.out.println("toplam=" + toplam);

    }

}
