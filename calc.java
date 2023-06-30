import java.util.Scanner;
class calc
{
	public static void main(String args[])
	{
	  try (Scanner myObj = new Scanner(System.in)) {
		System.out.println("Enter first operand : ");
		  float num1 = myObj.nextFloat();
		  System.out.println("Enter second operand : ");
		  float num2 = myObj.nextFloat();
		  System.out.println("Enter the operator from below list : \n+\n-\n*\n/\n");
		  char op = myObj.next().charAt(0);
		  switch(op)
		  {
		  	case '+':
		  	  System.out.println(num1+" + "+num2+" "+"= "+(num1+num2));
		  	  break;
		  	case '-':
		  	  System.out.println(num1+" - "+num2+" "+"= "+(num1-num2));
		  	  break;
		  	case '*':
		  	  System.out.println(num1+" * "+num2+" "+"= "+(num1*num2));
		  	  break;
		  	case '/':
		  	  System.out.println(num1+" / "+num2+" "+"= "+(num1/num2));
		  	  break;
		  	default:
		  	  System.out.println("Invalid");
		  	  break;
		  }
	}	  
	 } 	   
}
