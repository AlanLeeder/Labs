public class Car extends RoadVehicle 
{
    private int numDoors;

    public Car(String make, double price, int numDoors) {
        super(make, price);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateDuty() {
        return price * CARTAXRATE;
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() + " with " + numDoors + " doors";
    }
}
