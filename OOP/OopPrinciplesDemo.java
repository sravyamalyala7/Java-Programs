// Encapsulation:
// The fields of the class are private and accessed through getter and setter methods.

class Person {

    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstraction:
    // The displayInfo() method provides a simple interface to interact with the object.
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance:
// Employee is a subclass of Person, inheriting its properties and methods.

class Employee extends Person {

    // Private field
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Getter and Setter methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Polymorphism:
    // Overriding the displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}

public class OopPrinciplesDemo {

    public static void main(String[] args) {

        // Demonstrating Encapsulation and Abstraction
        Person person = new Person("Urmila", 30);

        System.out.println("Person Info:");
        person.displayInfo();

        System.out.println("====================");

        // Demonstrating Inheritance and Polymorphism
        Employee employee = new Employee("Lakshman", 26, 50000);

        System.out.println("Employee Info:");
        employee.displayInfo();
    }
} {
    
}
