package biggestnmbrversion2;

import java.util.Scanner;

//klavyeden girilen 3 sayidan en buyugunu bulan program
public class Biggestnmbrversion2 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        int sayi1 = k.nextInt();
        int EnBuyuk = sayi1;
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = k.nextInt();
        if (EnBuyuk < sayi2) {
            EnBuyuk = sayi2;
        }
        System.out.println("ucuncu sayiyi giriniz");
        int sayi3 = k.nextInt();
        if (EnBuyuk < sayi3) {
            EnBuyuk = sayi3;
        }
        System.out.println("en buyuk sayi=" + EnBuyuk);
    }

}
