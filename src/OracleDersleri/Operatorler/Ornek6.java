package OracleDersleri.Operatorler;

public class Ornek6 {

    public static void main(String[] args) {

        int sayi1 = 1, sayi2 = 2;
        int sonuc;

        boolean kontrol = false;

        kontrol = (sayi1 < sayi2) ? !kontrol : kontrol;

        System.out.println("İşlemin sonucu : " + kontrol);

        // Sayı 1 Sayı'den küçüktür.
    }


}
