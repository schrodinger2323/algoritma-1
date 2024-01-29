package yanlismidogrumu;

//stringteki a harflerini b yapan program       
public class NewClass4 {

    public static void main(String[] args) {
        String s = "araba";
        String bos = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                bos += 'b';
            } else {
                bos += s.charAt(i);
            }
        }
        System.out.println(bos);

    }
}
