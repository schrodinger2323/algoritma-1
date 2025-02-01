package algo1;
//fibonacci dizisinin ilk 10 elemanini ekrana yazdiran pr.

public class fibonacci {

    public static void main(String[] args) {
        int sayi1 = 1;
        System.out.print(sayi1 + " ");
        int sayi2 = 1;
        System.out.print(sayi2 + " ");

        for (int i = 3; i <= 10; i++) {
            int yeni = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = yeni;
            System.out.print(yeni + " ");
        }
    }
}
