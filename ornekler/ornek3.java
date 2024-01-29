package week3;

//20 ile 50 arasindaki tek sayilari ekrana yazan program
public class ornek3 {

    public static void main(String[] args) {
        int sayac = 21;
        //while dongusu ile
        while (sayac < 50) {
            if (sayac % 2 == 1) {
                System.out.println("tek sayi=" + sayac);
            }
            sayac++;
        }
        //for dongusu ile
        for (int i = 21; i < 50; i++) {
            if (i % 2 == 1) {
                System.out.println("tek sayi=" + i);
            }
        }

    }

}
