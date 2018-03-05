package OracleDersleri.Diziler;

public class Ornek5 {


    public static void main(String[] args) {


        /*


            Kaynak Dökümantasyon :


            https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html



         */



        // Örnek 4' ün kısa yoludur. Java.util.arrays bize güçlü özellikler sunar.
        char[] kaynak = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] alan = java.util.Arrays.copyOfRange(kaynak, 2, 9);

        System.out.println(new String(alan));

    }

}
