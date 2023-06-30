class Main 
{
    public static void main( String[] args) 
    {
        double length = 10.0;
        double width = 5.0;
        double height = 2.5;
        double volume = Box.calculateVolume(length, width, height);
        System.out.println("The volume of the box is: " + volume);
    }
}