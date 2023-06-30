class MulTable
{
    public static void main(String args[])
    {
        System.out.println("The multiplication table from 1 to 4 is : ");
        int mul[][] = new int[4][4];
        int row = 1 , col = 1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                mul[i][j] = row*col;
                col=col+1;
            }
            row=row+1;
            col=1;
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" "+mul[i][j]+"\t");
            }
            System.out.println();
        }
    }
}