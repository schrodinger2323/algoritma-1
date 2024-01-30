package hafta8;

//parametre olarak gelen sayinin sayi degerleri toplamini geri donduren metod
public class NewClass3 {

    public static int bastop(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }

    public static void main(String[] args) {

        int sonuc = bastop(98124);
        System.out.println("sayinin basamak degerleri toplami= " + sonuc);

    }
}
