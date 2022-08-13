import java.util.Scanner;
class square
{
    Scanner s = new Scanner(System.in);
    protected
        int length;
    square()
    {
        System.out.print("Enter Length : ");
        length=s.nextInt();
    }
    void area()
    {
        int area = length * length;
        System.out.println("Area of square: "+area);
    }
}
class rectangle extends square
{
    protected
        int breadth;
    rectangle()
    {
        System.out.print("Enter Breadth : ");
        breadth=s.nextInt();
    }
    void rectarea()
    {
        int area = length * breadth;
        System.out.println("Area of Rectangle: "+ area);
    }
}
class box extends rectangle
{
    protected
        int height;
    box()
    {
        System.out.print("Enter hight : ");
        height=s.nextInt();
    }
    void boxarea()
    {
        int area = length * breadth * height;
        System.out.println("Area of Box: "+ area);
    }
}
class multiple
{
    public static void main(String args[])
    {
        box b = new box();
        b.boxarea();
        b.rectarea();
        b.area();
    }
}
