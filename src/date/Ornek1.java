package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ornek1 {

    public static void main(String[] args) {

        java.util.Date utilDate = new java.util.Date();
        System.out.println("Java Util Date : " + utilDate);


        System.out.println("--------------------------");

        // SQL Formatına çevirmek için.

        java.sql.Date sqlDate = convert(utilDate);
        System.out.println("Java Sql Date : " + sqlDate);

        System.out.println("--------------------------");


        DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        System.out.println("dateFormated date is : " + df.format(utilDate));

        System.out.println("--------------------------");

    }


    private static java.sql.Date convert(java.util.Date uDate) {

        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;

    }


    /*

    java.util.Date is : Fri Jul 22 14:40:35 IST 2016
    java.sql.Date is : 2016-07-22
    dateFormated date is : 22/07/2016 - 02:40:35

     */


}
