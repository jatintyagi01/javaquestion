class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting with key ignition.");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is starting with kick.");
    }
}

public class main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "EMP123", 55000);
        emp.printDetails();

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}
