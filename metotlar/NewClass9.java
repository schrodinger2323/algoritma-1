package hafta8;

//kendisine parametre olarak gelen stringteki rakamlari toplayan
public class NewClass9 {

    public static int stringrakamtop(String a) {
        int toplam = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {

                toplam += (a.charAt(i) - 48);
            }
        }
        return toplam;
    }

    public static void main(String[] args) {

        System.out.println(stringrakamtop("123skdfh2"));
    }
}
