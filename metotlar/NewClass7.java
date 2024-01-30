package hafta8;

//kendisine parametre olarak gelen stringte, yine parametre olarak gelen karakterin olup olmadigini geri donduren metod
public class NewClass7 {

    
    public static boolean akontrol(String a, char c) {
        boolean kontrol = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                kontrol = true;
                break;
            }
        }
        return kontrol;
    }

    public static void main(String[] args) {

        System.out.println(akontrol("jawdsh", 'e'));

    }
}
