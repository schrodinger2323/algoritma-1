package ornek1;

public class NewClass1 {

    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringin polindrom olup olmadigini
        //geri donduren method
        String s = "kazak";
        System.out.println(pkontrol(s));
    }

    public static boolean pkontrol(String str) {
        int low = 0;
        int high = str.length() - 1;
        boolean kontrol = true;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                kontrol = false;
                break;
            } else {
                low++;
                high--;
            }
        }
        return kontrol;
    }
}
