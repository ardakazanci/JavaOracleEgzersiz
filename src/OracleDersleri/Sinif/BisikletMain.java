package OracleDersleri.Sinif;

public class BisikletMain {

    public static void main(String[] args) {


        // Create two different
        // Bisiklet objects
        // İki Adet bisiklet nesnesi oluşturuyor.
        Bisiklet bike1 = new Bisiklet();
        Bisiklet bike2 = new Bisiklet();

        // Invoke methods on
        // those objects
        // Oluşturulan nesnelere ait metotlara erişip değer veriyor.

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
