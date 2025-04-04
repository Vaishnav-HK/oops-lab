public class studentConstructor{
    public static void main(String[] args) {
        Student studObj = new Student("Vaish", 18);
        studObj.displayInfo();
    }
}

class Student {
    String name;
    int age;

    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        System.out.println("Student created: " + name + ", Age: " + age);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

