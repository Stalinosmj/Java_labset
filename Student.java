class Student
{
    public static void main(String args[])
    {
        int count=0;
        int weight[] = {55, 48, 60, 52, 47, 58, 51, 53, 49, 54};
        int height[] = {165, 155, 170, 162, 158, 175, 161, 163, 159, 164};
        for (int i=0; i<weight.length; i++)
        {
            if (weight[i]>50 && height[i]>160)
            {
                count++;
            }
        }
        System.out.println("Total number of people with weight >50 and height >160: " + count);
    }
}