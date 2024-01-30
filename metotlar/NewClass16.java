package hafta8;

//kendisine parametre olarak gelen iki sayinin a^b hesaplayan metod
public class NewClass16 {

    public static int usalma(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(usalma(3, 2));
    }
}
