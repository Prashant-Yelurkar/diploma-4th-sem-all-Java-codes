import java.util.Scanner;
class notmatch extends Exception
{
    String S;
    Scanner s = new Scanner(System.in);
    public void check()
    {
        System.out.print("Enter A Sring : ");
        S = s.nextLine();
        try{
            if(S == "India")
            {
                System.out.println("Perfect String");
            }
            else
            {
                throw NotMatchException();
            }
        }
        catch(NotMatchException n)
        {
            System.out.println("Wrong String ");
        }
    }
    public static void main(String atgs[])
    {
        notmatch n = new notmatch();
        n.check();
    }
}