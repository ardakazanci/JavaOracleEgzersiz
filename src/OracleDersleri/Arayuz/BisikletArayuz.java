package OracleDersleri.Arayuz;

interface Bisiklet {


    // Bir bisiklette olması gereken en önemli temel özellikler bir arayüzde tanımlandı

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int artışı);

    void applyBrakes(int azalma);

}