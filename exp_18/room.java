import java.util.Scanner;
class Area
{
    Scanner s = new Scanner(System.in);
    int length,breadth,height;
    float area;
    void getdata()
    {
        System.out.print("Enter Room length : ");
        length = s.nextInt();
        System.out.print("Enter Room breadth : ");
        breadth = s.nextInt();
        System.out.print("Enter Room height : ");
        height = s.nextInt();
    }
    void display()
    {
        area= 2*((length * breadth )+ (breadth * height) + (length * height));
        System.out.println("Room Area is : " + area);
    }
}
class Volume extends Area
{
    float volume;
    void getdata()
    {
        super.getdata();
    }
    void display()
    {
        super.display();
        volume = (length*breadth*height);
        System.out.println("Room Volume is : " + volume);
    }
}
class room{
    public static void main(String args[])
    {
        Volume V = new Volume();
        V.getdata();
        V.display();
    }
}