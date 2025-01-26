package algo1;

//fibonacci dizisinin ilk 100 terimini ekrana yazdıran pr.
public class NewClass26 {

    public static void main(String[] args) {

        long sayi1 = 1, sayi2 = 1;
        System.out.println(1);
        System.out.println(1);

        long yeni;
        for (int i = 3; i <= 100; i++) {
            yeni = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = yeni;
            System.out.println(yeni);
        }
    }
}
