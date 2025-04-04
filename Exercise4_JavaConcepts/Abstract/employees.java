public class employees_abstract {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Vaish", 4000);
        Employee emp2 = new PartTimeEmployee("Peter Parker", 20, 80);

        emp1.displayInfo();
        System.out.println("Monthly Salary: $" + emp1.calculateSalary());

        emp2.displayInfo();
        System.out.println("Monthly Salary: $" + emp2.calculateSalary());
    }
}

abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

