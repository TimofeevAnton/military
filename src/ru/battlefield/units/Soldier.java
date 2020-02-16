package ru.battlefield.units;

public class Soldier extends AbstractHuman implements Shooter, Shootable {

    private short shootPower;

    public Soldier(short shootPower, short health, short armor) {
        super(health, armor);
        this.shootPower = shootPower;

    }

    @Override
    public void getShot(short shootPower) {
        short armor = getArmor();
        short health = getHealth();
        health = (short) (health - shootPower / armor);

        if (armor == 0) {
            setHealth((short) (health - shootPower));
        } else {
            setHealth((short) (health - shootPower / armor));
        }
    }

    @Override
    public void shoot(Shootable target) {
        target.getShot(shootPower);
    }
}
