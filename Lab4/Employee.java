public class Employee 
{
    private static int nextEmpNumber = 1000;

    protected int employeeNumber;
    protected String type;
    protected Address address;

    public Employee(String type, Address address) {
        this.employeeNumber = nextEmpNumber++;
        this.type = type;
        this.address = address;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee #" + employeeNumber + " (" + type + ") - " + address;
    }
}
