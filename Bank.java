public class Bank {
    String name, accType;
    int accNo, balance;

    Bank(String name, int accNo, String accType, int balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accNo);
        System.out.println("Account Type: "+accType);
        System.out.println("Balance: "+balance);
    }
    void addMoney(int glitch) {
        balance = balance+glitch;
    }
}