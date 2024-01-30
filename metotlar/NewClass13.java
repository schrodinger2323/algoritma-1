package hafta8;

//kendisine parametre olarak gelen dizinin elemanlarini 1 artirip geri donduren metod
public class NewClass13 {

    public static int[] degerartir(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i]++;

        }
        return a;
    }

    public static void main(String[] args) {

        int dizi[] = {1, 1, 1, 1, 1, 1};
        degerartir(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }
}
