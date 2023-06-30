import java.util.Scanner;
class Odd_Even
{
    public static void main(String args[])
    {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter the Number : ");
            int num = myObj.nextInt();
            if (num%2==0)
            {
                System.out.println(num+" is an even number");
            }
            else
            {
                System.out.println(num+" is an odd number");
            }
        }
    }
}