public class Employee_main {
    public static void main(String[] args) {
        // create a manager object
        Manager mgr = new Manager("Jane", 40, "1234567890", "123 Main St", 2000, "Sales", "Sales");
        // create an officer object
        Officer off = new Officer("Jack", 35, "1234567890", "123 Main St", 1500, "Sales", "Sales");

        // print the salary of the manager
        mgr.printSalary();
        mgr.details();
        System.out.println("");
        System.out.println("");
        // print the salary of the officer
        off.printSalary();
        off.details();
    }

}
