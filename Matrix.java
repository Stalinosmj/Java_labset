class Matrix
{
    public static void main(String args[])
    {
        int sq_matrix[][] = new int[5][5];
        System.out.println("The matrix is");
        int row = 1 , col = 1;
        int k=0;
        int diagonal_sum=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                sq_matrix[i][j] = k++;
                col=col+1;
                 System.out.print(" "+sq_matrix[i][j]+"\t");
            }
             System.out.println();
            row=row+1;
            col=1;
        }
        for (int i=0; i<5; i++)
        {
            diagonal_sum += sq_matrix[i][i];
        }

        System.out.println("The diagonal sum of elements of this array is: " + diagonal_sum);
    }
}


