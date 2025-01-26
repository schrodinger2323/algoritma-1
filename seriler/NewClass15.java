package algo1;

//1den 5e kadar olan sayilari 3 fazlasini alarak toplayan

public class NewClass15 {

    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            toplam = toplam + (i + 3);
        }
        System.out.println(toplam);
    }
}
