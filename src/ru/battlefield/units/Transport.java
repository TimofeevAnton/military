package ru.battlefield.units;

public class Transport extends AbstractMachine implements Shootable {
    private short armor;

    public Transport(short armor, short fuel) {
        super(fuel);
        this.armor = armor;
    }

    @Override
    public void getShot(short shootPower) {
        short fuel = getFuel();


        if (armor == 0) {
            setFuel((short) (fuel - shootPower));
        } else {
            setFuel((short) (fuel - shootPower / armor));
        }
    }
}