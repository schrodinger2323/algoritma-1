package hafta8;

import java.util.Random;

//kpog boyutlardaki diziye random sayi atayarak tam sayi dizisi olusturan
//kendisine parametre olarak gelen(kpog) iki diziyi toplayip yeni dizi donduren
//dizinin elemanlarini gosteren metodlar
public class Hafta8 {

    public static int[][] diziolustur(int m, int n) {
        int[][] dizi = new int[m][n];
        Random r = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dizi[i][j] = r.nextInt(10);
            }
        }
        return dizi;
    }

    public static int[][] dizitoplama(int[][] a, int[][] b) {
        int toplam[][] = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                toplam[i][j] = a[i][j] + b[i][j];
            }
        }
        return toplam;
    }

    public static void dizigoster(int[][] a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        int[][] dizi1 = diziolustur(5, 5);
        dizigoster(dizi1);
        System.out.println("--------");
        int[][] dizi2 = diziolustur(5, 5);
        dizigoster(dizi2);
        System.out.println("--------");
        int[][] toplamsonuc = dizitoplama(dizi1, dizi2);
        dizigoster(toplamsonuc);

    }

}
