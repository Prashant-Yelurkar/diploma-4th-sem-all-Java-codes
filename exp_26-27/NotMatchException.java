import java.util.*;
class NotMatchException extends Exception
{
    String S1;
    Scanner s = new Scanner(System.in);
    public void check()
    {
        try{
            System.out.print("Enter A Sring : ");
            S1 = s.nextLine();
            if(S1.equals("India"))
            {
                System.out.println("Perfect String");
            }
            else
            {
                throw new NotMatchException();
            }
        }
        catch(NotMatchException n)
        {
            System.out.println("Error : Wrong String");
        }
    }
    public static void main(String atgs[])
    {
        NotMatchException n = new NotMatchException();
        n.check();
    }
}