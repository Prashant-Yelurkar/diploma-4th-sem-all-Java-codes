import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int num;
        int fact = 1;
        Scanner S = new Scanner(System.in);
        System.out.print("\n\nEnter Number to find factorial : ");
        num = S.nextInt();
        for(int i =1;i<=num;i++)
        {
            fact= fact*i;
        }
        System.out.println("\nFactorial of "+ num +" is : "+ fact);
    }

}