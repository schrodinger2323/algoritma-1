package hafta8;

//kendisine parametre olarak gelen string dizisindeki kelimelerin palindrom olup
//olmadigini geri donduren metod
public class NewClass {

    public static boolean polindrom(String kelime) {
        boolean kontrol = true;
        int low = 0;
        int high = kelime.length() - 1;
        while (low < high) {
            if (kelime.charAt(low) != kelime.charAt(high)) {
                kontrol = false;
                break;
            }
            low++;
            high--;
        }
        return kontrol;
    }

    public static void main(String[] args) {

        String[] kelimeler = {"kabak", "yapay", "0010111", "0010100"};
        for (int i = 0; i < kelimeler.length; i++) {

            System.out.println(kelimeler[i] + " " + polindrom(kelimeler[i]));
        }
    }

}
