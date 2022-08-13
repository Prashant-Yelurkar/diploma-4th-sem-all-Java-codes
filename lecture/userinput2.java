import java.io.*;
import java.lang.*;
class userinput2
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int a, b,c;
        float x, y,z;
        String Name;
        System.out.print("Enter value of a :");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter value of b :");
        b = Integer.parseInt(br.readLine());
        c = a + b;
        System.out.println("Addition of a & b is :"+ c +"\n\n");

        System.out.print("Enter value of x :");
        x = Float.parseFloat(br.readLine());
        System.out.print("Enter value of y :");
        y = Float.parseFloat(br.readLine());
        z = x + y;
        System.out.println("Addition of a & b is :"+ z +"\n\n");

        System.out.print("Enter Your Name :");
        Name = br.readLine();
        System.out.println("Name is : "+ Name);
    }
}