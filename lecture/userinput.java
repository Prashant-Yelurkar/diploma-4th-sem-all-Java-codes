import java.util.*;
import java.lang.*;
class userinput
{
    public static void main(String agr[])
    {
        int a, b;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = S.nextInt();
        System.out.println("Enter the value of b :");
        b = S.nextInt();
        int c = (a>b)? a:b;
        System.out.println("\n"+"The greater value is : "+c);
    }
}