class  fibo
{
	public static void main(String args[])
	{
	  long a=0,b=1,c=a+b,i=3;
	  System.out.println("Term 1 - "+a);
	  System.out.println("Term 2 - "+b);
	  while(i<=50)
	  {
	    
	    System.out.println("Term "+i+" - "+c);
	    
	    a=b;
	    b=c;
	    c=a+b;
	    i++;
	    }
	  }
}
	  
	   
