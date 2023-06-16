import java.util.Scanner;
class Calendar
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the choice from the Menu : ");
		System.out.println("1) Number of days in given month.\n2) List the months with 31 days.\n3) List the months with 30 days.");
		int choice = myObj.nextInt();
		
		int month_dates[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String month_name[] = {"Januray","February","March","April","May","June","July","August","September","October","November","December"};
		
		switch(choice)
		{
			case 1 :
				System.out.println("Enter the number of the month : ");
				int month_num = myObj.nextInt();
				month_num=month_num-1;
				System.out.println("Number of days " + month_name[month_num] + " month has :" + month_dates[month_num]);
				break;
			case 2 :
				System.out.println("Months with 31 days are: ");
				for (int i=0;i<12;i++)
				{
					if (month_dates[i]==31)
					{
						System.out.println(month_name[i]);
					}
				}
				break;
			case 3 :
				System.out.println("Months with 31 days are: ");
				for (int i=0;i<12;i++)
				{
					if (month_dates[i]==30)
					{
						System.out.println(month_name[i]);
					}
				}
				break;
			default :
				System.out.println("Invalid");
		}
		
	}
}
