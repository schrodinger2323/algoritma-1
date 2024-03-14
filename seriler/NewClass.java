package javaapplication18;

public class NewClass {

    public static void main(String[] args) {
        double toplam = 0;
        int carpim = 1;
        for (int i = 1; i <= 5; i++) {
            carpim = 1;
            for (int j = 1; j <= i; j++) {
                carpim = carpim * (j + 1);
            }
            toplam += (i / carpim);
        }
        System.out.println(toplam);
    }
}
