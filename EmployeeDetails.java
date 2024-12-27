// Program 2
// Write a program to calculate the annual salary of an employee using inheritance method


// Parent Class- User
class User {
    int id; // Property: id of the User
    String name; // Property: name of the User

    // Constructor to initialize id and name
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Subclass: Employee
class Employee extends User {
    double salary; // Property: monthly salary of the employee

    // Constructor to initialize id, name, and salary
    Employee(int id, String name, double salary) {
        super(id, name); // Call the parent class constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
     double calculateAnnualSalary() {
        return salary * 12; // Monthly salary * 12 months
    }
}

// Main Class
public class EmployeeDetails {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(594, "Nikhil Sahani", 500000); 

        // Calculate the annual salary
        double annualSalary = employee.calculateAnnualSalary();

        // Display employee details and annual salary
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Annual Salary: " + annualSalary);
    }
}


