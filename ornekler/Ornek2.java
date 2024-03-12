package javaapplication12;

//random uretilen sayinin 2ye veya 3e bolunup bolunmedigini ekrana yazan pr.
public class Ornek2 {

    public static void main(String[] args) {
        int sayi1 = (int) (Math.random() * 100);
        System.out.println("Uretilen sayi=" + sayi1);
        if (sayi1 % 2 == 0 && sayi1 % 3 == 0) {
            System.out.println("Sayi 6ya bolunebilir");

        } else if (sayi1 % 2 == 0 || sayi1 % 3 == 0) {
            System.out.println("sayi 2 veya 3e bolunebiliyor");
            if (sayi1 % 2 == 0) {
                System.out.println("sayi 2ye bolunur");

            } else {
                System.out.println("sayi 3e bolunur");
            }
        } else {
            System.out.println("sayi6ya bolunemez!");
        }
    }

}
