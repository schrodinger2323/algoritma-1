
package daireninalani;

//klavyeden girilen sayiyi ters ceviren pr/
//basamaklarina ayirarak her defasinda kalani ekrana yaziyor
//string olarak alarak
//int olarak alip stringe donusturerek
public class NewClass {

    public static void main(String[] args) {

        //BURDA sayinin modunu alarak basamaklara ayiriyor her seferinde ekrana basiyoruz ornegin 365%10=5 birler basamagi
        //ardindan sayiyi 10 boluyoruz int dedik ki sadece tam kismini alsin boldugu zaman orengin 365/10=36
        //double tanimlasaydik 36.5 gelirdi/ sonra tekrar 36 nin modunu aliyor 0 olana kadar
        int sayi = 23;
        int kalan;
        if (sayi < 0) {
            sayi = -sayi;
            System.out.print("-");
        } else if (sayi == 0) {
            System.out.println("0");
        }

        while (sayi > 0) {
            kalan = sayi % 10;
            System.out.print(kalan + "");
            sayi = sayi / 10;
        }

        System.out.println("");

        //BURDA DA STRING OLARAK ALDIK VE STRING OLARAK YAZDIRDIK EKRANA
        String sayi1 = "365";
        String sonuc = "";
        for (int i = 0; i < sayi1.length(); i++) {
            sonuc = sayi1.charAt(i) + sonuc;
        }
        System.out.println(sonuc);

        System.out.println("");

        ///////////
        int sayi2 = 786;
        String s = Integer.toString(sayi2);//sayimizi integer olarak aldik Integer.toString methoduyla stringe donusturduk
        String stop = "";                    //string turunde boş bir stop değişkeni actik 
        for (int i = s.length() - 1; i >= 0; i--) { //strınge dönüştürdüğümüz sayının karakterlerini tersten alıp stop a ekleyeceğiz
            stop += s.charAt(i);
        }
        int yeni_say = Integer.parseInt(stop);//burda stopta biriken 563 stringini tekrar integera dönüştürdük ve ekran ayazdık
        System.out.println(yeni_say);
    }
}
