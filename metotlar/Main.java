package ornek1;

public class Main {

    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringteki kucuk karakterlerin sayisini
        //geri donduren method
        String s = "23Hacersad";
        int x = kucuk(s);
        System.out.println(x);
    }

    public static int kucuk(String a) {
        int sayac = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                sayac++;
            }
        }
        return sayac;
    }

}
