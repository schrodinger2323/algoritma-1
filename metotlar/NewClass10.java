package hafta8;

//kendisine parametre olarak geln tam sayi dizisindeki tek elemanlarin ortalamasini geri donduren metod
public class NewClass10 {

    public static double ortalama(int[] a) {
        double toplam = 0, sayac = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                toplam += a[i];
                sayac++;
            }
        }
        return toplam / sayac;
    }

    public static void main(String[] args) {

        int dizi[] = {1, 2, 3, 4};
        System.out.println(ortalama(dizi));
    }
}
