package OracleDersleri.Diziler;

public class Ornek4 {


    public static void main(String[] args) {


        char[] kaynak = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] alan = new char[7];

        // Kaynak değerinde ki 2inci indisten başla toplam 6 karakter al ve alan'a ekle

        System.arraycopy(kaynak, 2, alan, 0, 7);

        System.out.println(new String(alan));


    }

}
