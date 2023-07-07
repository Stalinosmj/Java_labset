import java.util.Scanner;

class Fact {
    int recursiveFact(int fact) {
        if(fact > 1)
            return fact * recursiveFact(fact - 1);
        else
            return 1;
    }

    int iteractiveFact(int n) {
        int fact =1,i=1;
        for(i=1; i<=n; i++)
        fact = fact * i;
        System.out.println("Factorial of "+ n +"using iteractive is "+fact);
        return 0;
    }



    public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        Fact num = new Fact();
        System.out.println("Enter the Number");
        int fact = sc.nextInt();
        int temp=fact;
        num.recursiveFact(fact);
        System.out.println("The factorial of "+ fact +" using recursive is "+num.recursiveFact(fact));
        num.iteractiveFact(temp);
    }
}

}



