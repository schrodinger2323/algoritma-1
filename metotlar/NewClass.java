package ornek1;

public class NewClass {

    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringte 'a' karakterinin olup
        //olmadigini geri dnduren(boolean) method
        String s = "asdsad";
        System.out.println(akontrol(s));
    }

    public static boolean akontrol(String str) {
        boolean kontrol = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                kontrol = false;
            } else {
                kontrol = true;
                break;
            }

        }
        return kontrol;
    }
}
