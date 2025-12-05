public class RoadVehicle implements ImportDuty 
{
    protected String make;
    protected double price;  

    public RoadVehicle(String make, double price) {
        this.make = make;
        this.price = price;
    }

    @Override
    public double calculateDuty() {
        return 0;
    }

    @Override
    public String toString() {
        return make + " costing €" + price;
    }
}