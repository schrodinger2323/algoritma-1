package hafta8;

//kendisine parametre olarak gelen sayidan buyuk olani bulan metod
public class NewClass5 {

    public static int bbul(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println("buyuk olan sayi: " + bbul(3, 4));
    }
}
