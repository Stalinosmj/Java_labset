class Num_Word
{
    public static void main(String args[])
    {
        int number[] = {0,1,2,3,4,5,6,7,8,9};
		String words[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for (int i=0;i<10;i++)
        {
          System.out.println(number[i] +"-"+ words[i]); 
        }
    }
}