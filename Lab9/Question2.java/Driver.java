public class Driver
{
    public static void main(String[] args) {
        RoadVehicle[] vehicles = new RoadVehicle[2];

        vehicles[0] = new Car("Toyota Corolla", 20000, 4);
        vehicles[1] = new HGV("Volvo Transporter", 80000, 12);

        for (RoadVehicle v : vehicles) {
            System.out.println(v);
            System.out.println("Import Duty: €" + v.calculateDuty());
            System.out.println();
        }
    }
}
