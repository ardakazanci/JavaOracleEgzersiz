package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ornek2 {


    public static void main(String[] args) {

        // Tarih Gösterim Şekli Ayarlanır

        String formatString = "yyyy/MM/dd hh:mm:ss";

        // Geçerli bir tarih nesnesi alınır.

        Date date = Calendar.getInstance().getTime();

        // Tarih Formatı Uygulanır

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);


        System.out.println(simpleDateFormat);

        /*

       // single-line version of all above code
System.out.println(new SimpleDateFormat("yyyy/MM/dd
hh:mm.ss").format(Calendar.getInstance().getTime()));



         */

    }


}
