package ru.battlefield.units;

public class AbstractMachine extends AbstractArmyUnit{
   private short fuel;
   public AbstractMachine(short fuel) {
       this.fuel = fuel;

   }
protected short getFuel() {
       return fuel;

}
protected void setFuel(short fuel) {
       this.fuel = fuel;
}

    @Override
    public String toString() {
        return "AbstractMachine{" +
                "fuel=" + fuel +
                '}';
    }
}
