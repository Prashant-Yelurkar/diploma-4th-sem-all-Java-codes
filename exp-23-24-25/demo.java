import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner S =new Scanner(System.in);
        try
        {
            int a,b,c;
            System.out.print("Enter First number : ");
            a = S.nextInt();
            System.out.print("Enter Second number : ");
            b = S.nextInt();

            c = a + b;
            System.out.println("Addition of 2 Numbers : " + c);
            c = a * b;
            System.out.println("Multiplication of 2 Numbers : " + c);
            c = a / b;
            System.out.println("Division of 2 Numbers : " + c);
            c = a - b;
            System.out.println("Substraction of 2 Numbers : " + c);
        }
        
        catch(NumberFormatException e)
        {
            System.out.println("Exception: " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: " + e);
        }
        finally
        {
            System.out.println("Program End...................");
        }
        
    }
}