import java.io.*;
import java.lang.*;
class userinput1
{
    public static void main(String args[])throws Exception
    {
        DataInputStream d = new DataInputStream(System.in);
        int a,b,c;
        float x, y, z;
        System.out.println("Enter value of a :");
        a = Integer.parseInt(d.readLine());
        System.out.println("Enter the value of b :");
        b = Integer.parseInt(d.readLine());

        c = a + b;
        System.out.println("Addition of a & b is : "+ c);
        
        
        System.out.println("\n\n"+"Enter value of x :");
        x = Float.parseFloat(d.readLine());
        System.out.println("Enter the value of y :");
        y = Float.parseFloat(d.readLine());
        z = x + y;
        System.out.println("Addition of x & y is : "+ z);
    }
}