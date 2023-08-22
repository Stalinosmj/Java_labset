public class Employee {
    //create members such as Name, Age, phone number, Address, Salary
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;
    //create a method to print the salary of an employee
    void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }
}

//manager and officer inherits from employee
class Manager extends Employee {
    String specialization, department;
    Manager(String name, int age, String phoneNumber, String address, int salary, String specialization, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
        this.department = department;
    }
    
    void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }
}

class Officer extends Employee {
    String specialization, department;
    Officer(String name, int age, String phoneNumber, String address, int salary, String specialization, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
        this.department = department;
    }
    
    void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }
}

