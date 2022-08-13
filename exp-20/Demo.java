import let_me_claculate.*;
import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter First number :");
        int a = s.nextInt();
        System.out.print("Enter Second number :");
        int b = s.nextInt();
        System.out.print("The Additin of "+ a + " & "+ b +"is : ");
        calculator c = new calculator();
        c.add(a,b);
    }
}