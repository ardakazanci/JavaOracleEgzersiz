package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateIslemleri {

    public static void main(String[] args) {


        Date today = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

        System.out.println(dateFormat.format(today)); // 02 - 03 - 18

        dateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(dateFormat.format(today)); //25-02-2016
        dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
        System.out.println(dateFormat.format(today)); //25-02-2016 06:14:33 Thu
    }


}
