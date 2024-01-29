package yanlismidogrumu;

import java.util.Scanner;

//klavyeden girilen sayilarin ortalamasini bulan,
//0 girince durup ortalamayi ekrana yazan program
public class NewClass5 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int top, sayi, sayac, ort;
        top = 0;
        sayac = 0;
        ort = 0;
        sayi = k.nextInt();
        if (sayi == 0) {
            System.out.println(ort);
        }
        do {
            top += sayi;
            sayac++;
            ort = top / sayac;
            sayi = k.nextInt();
            if (sayi == 0) {
                System.out.println(ort);
                break;
            }
        } while (sayi != 0);

    }

}
