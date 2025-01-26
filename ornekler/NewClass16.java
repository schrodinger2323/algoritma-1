package algo1;

//carpim tablosunu ekrana yazdiran pr.
public class NewClass16 {

    public static void main(String[] args) {

        int carpim;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                carpim = i * j;
                System.out.println(i + "*" + j + "=" + carpim);
            }
            System.out.println("\n");
        }

    }

}
