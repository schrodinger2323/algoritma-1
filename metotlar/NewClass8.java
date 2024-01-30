package hafta8;

//kendisine parametre olarak gelen stringi ters ceviren method
public class NewClass8 {

    public static String reverse(String a) {
        String r = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            r = r + a.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.println(reverse("hacer2323"));
    }
}
