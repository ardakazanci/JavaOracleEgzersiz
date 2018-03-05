package OracleDersleri.OOP1;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int startCadence, int startGear, int startSpeed) {

        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;

    }


    public int getCadence() {

        return cadence;

    }

    public int getGear() {

        return gear;

    }

    public int getSpeed() {

        return speed;

    }


    public void setCadence(int newValue) {

        cadence = newValue;

    }

    public void setGear(int newValue) {

        gear = newValue;

    }

    public void setSpeed(int newValue) {

        speed = newValue;

    }

    public void applyBreak(int decrement) {

        speed -= decrement;

    }

    public void speedUp(int increment) {

        speed += increment;

    }


}
