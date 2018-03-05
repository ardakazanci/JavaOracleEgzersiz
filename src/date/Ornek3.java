package date;

import java.time.LocalDate;
import java.time.ZoneId;

public class Ornek3 {

    public static void main(String[] args) {

        // İstenilen tarih değerini oluşturmak için kullanılır.




        // Varsayılan tarih değeri


        LocalDate localDate = LocalDate.now();


        // İstenilen Tarih Değerleri

        localDate = LocalDate.of(2018,12,5);

        // Diziden Tarih Yaratma

        localDate = LocalDate.parse("2018-12-5");

        // Bölgeden Tarih Oluşturma

        LocalDate.now(ZoneId.systemDefault());



    }


}
