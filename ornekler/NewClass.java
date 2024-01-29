package week3;

import java.util.Scanner;

//0 ile 20 arasinda uretilen random bir sayiyi tahmin etme oyunu
public class NewClass {

    public static void main(String[] args) {
        int sayi = (int) (Math.random() * 21);
        int tahmini_sayi = -1;
        Scanner oku = new Scanner(System.in);
        System.out.println("0 ile 20 arasindaki sayiyi tahmin ediniz");
        while (sayi != tahmini_sayi) {
            System.out.println("tahmininiz=");
            tahmini_sayi = oku.nextInt();
            if (sayi > tahmini_sayi) {
                System.out.println("sayi daha buyuk");
            } else if (sayi < tahmini_sayi) {
                System.out.println("sayi daha kucuk");

            } else {
                System.out.println("tebrikler sayiyi buldunuz");
                break;
            }
        }

    }

}
