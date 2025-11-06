import java.util.ArrayList;

public class Office 
{
    private static int nextRoomNumber = 100;

    private int roomNumber;
    private ArrayList<Employee> employees;

    public Office() {
        this.roomNumber = nextRoomNumber++;
        this.employees = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean addEmployee(Employee emp) {
        if (employees.size() < 2) {
            employees.add(emp);
            return true;
        } else {
            System.out.println("Office " + roomNumber + " is full.");
            return false;
        }
    }

    public int getNumEmployees() {
        return employees.size();
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in office " + roomNumber);
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Office #" + roomNumber + " | Employees: " + employees.size();
    }
}
