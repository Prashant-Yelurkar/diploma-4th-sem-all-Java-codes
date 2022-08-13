import java.util.*;
class test extends Exception 
{
    Scanner s = new Scanner(System.in);
    public void checknum()
    {
        try{
            int num;
            System.out.print("Enter a number : ");
            num = s.nextInt();
            if(num<0)
            {
                throw new test();
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        catch(test e)
        {
            System.out.println("\n Error : Number is negative ");
        }

    }
    public static void main(String srgs[])
    {
        test t = new test();
        t.checknum();
    }
}