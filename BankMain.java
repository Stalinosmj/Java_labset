import java.util.Scanner;
class Bankmain {
    public static void main(String args[]) {
        boolean exit= false;
        Bank cust1 = new Bank("John", 101, "Savings", 10000);
        try (Scanner sc = new Scanner(System.in)) {
            while (exit == false) {
                System.out.println("Select an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount to Deposit:");
                        int amount = sc.nextInt();
                        cust1.deposit(amount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        amount = sc.nextInt();
                        cust1.withdraw(amount);
                        break;
                    case 3:
                        cust1.display();
                        break;
                    case 5:
                        int glitch = sc.nextInt();
                        cust1.addMoney(glitch);
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }    
}