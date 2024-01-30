package hafta8;
//kendisine paramtere olarak gelen sayinin basamak sayisini geri donduren method

public class NewClass2 {

    public static int basamaksayisi(int sayi) {
        int sayac = 0;
        while (sayi > 0) {
            sayi = sayi / 10;
            sayac++;
        }
        return sayac;
    }

    public static void main(String[] args) {

        System.out.println("basamak sayisi= " + basamaksayisi(987));
    }
}
