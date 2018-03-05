package OracleDersleri.Arayuz;

public class DagBisikleti implements Bisiklet {


    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // Bir bisiklette olması gereken genel özellikleri implement ile almış olduk.

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;

    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;

    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
