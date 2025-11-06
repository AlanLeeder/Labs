import java.util.ArrayList;

public class MyHR 
{
    public static void main(String[] args) 
    {
        ArrayList<Office> offices = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        String carType;
        int officeNum;

        for (int i = 0; i < 3; i++) 
        {
            offices.add(new Office());
        }

        int choice;
        do {
            System.out.println("\n--- MyHR System ---");
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = EasyIn.getInt();

            switch (choice) 
            {
                case 1:
                    for (Office o : offices) 
                    {
                        System.out.println(o);
                    }
                    break;

                case 2:
                    if (employees.size() >= 5) 
                    {
                        System.out.println(" Maximum of 5 employees reached.");
                        break;
                    }

                    System.out.println("Enter employee type (Staff/Manager): ");
                    String type = EasyIn.getString();

                    System.out.println("Enter Street Address: ");
                    String street = EasyIn.getString();
                    System.out.println("Enter Town: ");
                    String town = EasyIn.getString();
                    System.out.println("Enter County: ");
                    String county = EasyIn.getString();

                    Address address = new Address(street, town, county);
                    Employee emp;

                    if (type.equalsIgnoreCase("Manager")) 
                    {
                        System.out.println("Enter Car Type: ");
                        carType = EasyIn.getString();
                        emp = new Manager(address, carType);
                    } 
                    else 
                    {
                        emp = new Employee("Staff", address);
                    }

                    System.out.println("Available Offices:");
                    for (Office o : offices) 
                    {
                        System.out.println(o);
                    }

                    System.out.println("Enter office number to assign employee: ");
                    officeNum = EasyIn.getInt();

                    Office chosen = null;
                    for (Office o : offices) 
                    {
                        if (o.getRoomNumber() == officeNum) 
                        {
                            chosen = o;
                            break;
                        }
                    }

                    if (chosen != null) 
                    {
                        if (chosen.addEmployee(emp)) 
                        {
                            employees.add(emp);
                            System.out.println("Employee added successfully!");
                        }
                    } 
                    else 
                    {
                        System.out.println("Office not found.");
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) 
                    {
                        System.out.println("No employees yet.");
                    } 
                    else 
                    {
                        for (Employee e : employees) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting MyHR... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
    }
}
