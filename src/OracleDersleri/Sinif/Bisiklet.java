package OracleDersleri.Sinif;

public class Bisiklet {

    int cadence = 0; // Mevcut Durum
    int speed = 0; // Mevcut Hız
    int gear = 1; // Mevcut Vites

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }


}
