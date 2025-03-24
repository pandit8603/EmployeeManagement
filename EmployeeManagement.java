import java.util.*; 


class Employee {
 
    private final int id;
    private final String name;
    private final double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
    
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ajay", 50000));
        employees.add(new Employee(102, "Vijay", 60000));
        employees.add(new Employee(103, "Ramesh", 70000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
