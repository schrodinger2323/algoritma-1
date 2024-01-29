package yanlismidogrumu;

import java.util.Scanner;
//2*2 boyutundaki tam sayi dizisindeki 
//en buyuk elemanin bulundugu satir ve sutunu ekrana yazan program
public class NewClass2 {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int dizi[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                dizi[i][j] = k.nextInt();
            }
        }
        int enbuyuk = dizi[0][0];
        int sat = 0, sut = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (dizi[i][j] > enbuyuk) {
                    enbuyuk = dizi[i][j];
                    sat = i;
                    sut = j;
                }
            }
        }
        System.out.println(sat + "," + sut);
    }
}
