package getter_setter_ornek;

public class Ornek1Main {


    public static void main(String[] args) {

        // Bir sınıf içerisinde final olmadığı harici public değişken tanımlanmamalıdır.


        Ornek1 ornekNesne = new Ornek1();

        ornekNesne.setName("Arda Kazancı");
        System.out.println(ornekNesne.getName());

        Ornek2 ornekNesne2 = new Ornek2();
        ornekNesne2.setName("Arda Kazancı"); // 10 Karakterden uzun string ifade girilemez
        System.out.println(ornekNesne2.getName());
        ornekNesne2.setName("Arda");
        System.out.println(ornekNesne2.getName()); // Arda yazar
        Ornek3 ornekNesne3 = new Ornek3();
        ornekNesne3.setAge(15);
        ornekNesne3.setName("Arda");
        System.out.println(ornekNesne3.getAge());
        System.out.println(ornekNesne3.getName());


    }


}
