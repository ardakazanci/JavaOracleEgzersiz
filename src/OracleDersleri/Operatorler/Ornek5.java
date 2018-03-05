package OracleDersleri.Operatorler;

public class Ornek5 {

    public static void main(String[] args) {

        /*

            && Şartlı-VE
            || Şartlı-VEYA

         */

        int deger1 = 1;
        int deger2 = 2;

        if ((deger1 == 1) && (deger2 == 2)) {

            System.out.println("Değer1 = 1 e eşit && Değer2 = 2 ' ye eşit ! ");

        }

        if ((deger1 == 1) || (deger2 == 3)) {

            System.out.println("Değer1 1 'e eşit yada değer2 3'e eşit ! ");

        }

    }

}
