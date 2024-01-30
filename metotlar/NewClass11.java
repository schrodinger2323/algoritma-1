package hafta8;

//kendisine parametre olarak gelen tek boyutlu tam sayi dizisindeki
//en buyuk elemanin indisini geri donduren metod
public class NewClass11 {

    public static int indexbul(int[] a) {
        int enb = a[0], yer = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > enb) {
                enb = a[i];
                yer = i;
            }
        }
        return yer;
    }

    public static void main(String[] args) {
        //enb sayinin indexini bul
        int dizi[] = {1, 2, 3, 4, 89};
        System.out.println("dizinin en buyuk elamninin indisi= " + indexbul(dizi));
    }
}
