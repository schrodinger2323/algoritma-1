package javaapplication18;

public class JavaApplication18 {

    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 50; i++) {
            toplam += (i + i * i);
        }
        System.out.println(toplam);
    }

}
