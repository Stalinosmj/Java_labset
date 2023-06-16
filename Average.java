class Average
{
	public static void main(String args[])
	{
		int num[] = {1,2,3,4,5,6,7,8,10};
		int sum = 0;
		int size = 9;
		float avg = 0;
		System.out.println("The average of numbers 1-9 is :");
		  
        for (int i = 0; i < size; i++)
        {
            sum += num[i];
        }
        avg = (float)sum/size;
        System.out.println(avg);
    }
}  
