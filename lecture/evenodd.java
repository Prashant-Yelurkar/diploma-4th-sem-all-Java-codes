import java.util.*;
import java.lang.*;
class evenodd
{
    public static void main( String args[])
    {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("\n\nEnter Number to check Even or Odd :");
        a = s.nextInt();
        if(a%2 == 0)
        {
            System.out.println(a + " is a Even Number");
        }
        else
        {
            System.out.println(a + " is a Odd Number");
        }
    }
}