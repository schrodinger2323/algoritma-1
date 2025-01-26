package algo1;

public class NewClass17 {

    public static void main(String[] args) {

        //// Döngüde m*(m+3) hesaplanarak toplam değerine ekleniyor (aritmetik bir seri).
        int toplam = 0;
        for (int m = 1; m <= 6; m++) {
            toplam = toplam + (m * (m + 3));
        }
        System.out.println(toplam);

        // 0° ile 45° arasındaki açıların sinüs değerlerinin toplamı hesaplanıyor.
        double toplam2 = 0;
        for (double teta = 0; teta <= 45; teta++) {
            toplam2 = toplam2 + Math.sin(teta * 3.14 / 180);
        }
        System.out.println(toplam2);

        // (n+2)/n ifadesinin 2'den 10'a kadar toplamı hesaplanıyor.
        double toplam3 = 0;
        for (double n = 2; n <= 10; n++) {
            toplam3 = toplam3 + ((n + 2) / n);
        }
        System.out.println(toplam3);

        // 1° ile 5° arasındaki açıların sinüs değerleriyle çarpım yapılıyor.
        double carpim = 1;
        for (double k = 1; k <= 5; k++) {
            carpim = carpim * k * Math.sin(k * 3.14 / 180);
        }
        System.out.println(carpim);

        // m*(m+1) çarpımı ile birikimli çarpım yapılıyor (1*2, 2*3, ...).
        int carpim2 = 1;
        for (int m = 1; m <= 3; m++) {
            carpim2 = carpim2 * (m + 1) * m;
        }
        System.out.println(carpim2);

        //1+2/3+3/4+4/5+... seklinde giden serinin ilk 10 elemani toplami
        double toplam4 = 1;
        for (double i = 2; i <= 10; i++) {
            toplam4 = toplam4 + (i / (i + 1));
        }
        System.out.println(toplam4);
    }
}
