package tur_donusumleri_implicit;

public class BasitIslemler {

    public static void main(String[] args) {


        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;


        // char1 = char1 + char2; // Değişkenin tipi sayısal bir tip değil.


        int1 = char1 + char2;
        int1 = short1 + short2;
        int1 = short2 + char2;
        float1 = short1 + float2; // Ondalıklı bir sonuç olur ve değişken türümüz ondalıklı sayıyı destekler.
        int1 = int1 + int2;


    }

}
