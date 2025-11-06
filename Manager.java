public class Manager extends Employee 
{
    private String carType;

    public Manager(Address address, String carType) 
    {
        super("Manager", address);
        this.carType = carType;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | Car: " + carType;
    }
}
