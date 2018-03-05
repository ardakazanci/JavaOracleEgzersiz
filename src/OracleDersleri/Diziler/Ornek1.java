package OracleDersleri.Diziler;

public class Ornek1 {

    public static void main(String[] args) {


        int[] dizi;

        dizi = new int[10];

        dizi[0] = 0;
        dizi[1] = 1;
        dizi[2] = 2;
        dizi[3] = 3;
        dizi[4] = 4;
        dizi[5] = 5;
        dizi[6] = 6;
        dizi[7] = 7;
        dizi[8] = 8;
        dizi[9] = 9;
        // Exepcition hatası alırız çünkü dizinin sınırına değer verilemez 1 eksiğine değer verilir. dizi[10] = 10;


        System.out.println("Dizinin birinci değeri " + dizi[0]);
        System.out.println("Dizinin ikinci değeri " + dizi[1]);
        System.out.println("Dizinin üçüncü değeri " + dizi[2]);
        System.out.println("Dizinin dördündü değeri " + dizi[3]);
        System.out.println("Dizinin beşinci değeri " + dizi[4]);
        System.out.println("Dizinin altıncı değeri " + dizi[5]);
        System.out.println("Dizinin yedinci değeri " + dizi[6]);
        System.out.println("Dizinin sekizinci değeri " + dizi[7]);
        System.out.println("Dizinin dokuzun değeri " + dizi[8]);
        System.out.println("Dizinin onuncu değeri " + dizi[9]);


    }
}
