package ornek1;

public class NewClass10 {

    public static void main(String[] args) {
        //2 boyutlu string dizisinde her hücredeki string icinde rakam olmayan karakterlerı 
        //ekrana yazan method
        String s[][] = {{"ab2?0", "bdc56"}, {"5jk", "sd69"}};
        harfyaz(s);
    }

    public static void harfyaz(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length(); k++) {
                    if (a[i][j].charAt(k) < 48 || a[i][j].charAt(k) > 57) {
                        System.out.println(a[i][j].charAt(k));
                    }
                }
            }
        }
    }
}
