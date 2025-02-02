package ornek1;

public class NewClass13 {

    public static void main(String[] args) {
        //kpog iki boyutlu string dizisinin sutunlarindaki stringleri birlestirip tek boyutlu string dizisi haline getiren method
        String x[][] = {{"hacer", "zehra", "23"}, {"cadirci", "topcu", "elazig"}};
        String y[] = new String[3];
        y = birlestir(x);
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

    }

    public static String[] birlestir(String a[][]) {
        String yeni[] = new String[3];
        String bos = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                bos += a[j][i];
            }
            yeni[i] = bos;
            bos = "";
        }
        return yeni;
    }
}
