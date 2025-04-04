public class empHybrid {
    public static void main(String[] args) {
        System.out.println("Manager Details");
        Manager m = new Manager();
        m.displayPerson();    
        m.displayEmployee();  
        m.showRole();

        System.out.println("\nEngineer Details");
        Engineer e = new Engineer();
        e.displayPerson();    
        e.displayEmployee();  
        e.showRole();         
    }
}

class Person {
    String name = "Vaish";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    void showRole() {
        System.out.println("Role: Manager");
    }
}

class Engineer extends Employee {
    void showRole() {
        System.out.println("Role: Engineer");
    }
}

