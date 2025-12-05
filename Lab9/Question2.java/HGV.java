public class HGV extends RoadVehicle 
{
    private double loadCapacity;

    public HGV(String make, double price, double loadCapacity) {
        super(make, price);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateDuty() {
        return price * HGVTAXRATE;
    }

    @Override
    public String toString() {
        return "HGV: " + super.toString() + " with load capacity " + loadCapacity + " tons";
    }
}
