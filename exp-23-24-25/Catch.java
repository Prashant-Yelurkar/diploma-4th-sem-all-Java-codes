import java.lang.*;
import java.io.*;
import java.util.*;

class Prashant extends Exception
{
    Prashant(String msg)
    {
        super(msg);
    }
}
class Catch
{
    public static void main (String args[])
    {
        Scanner S = new Scanner(System.in);

        String a ="PRASHANT";
        System.out.print("Enter Password : ");
        try{
            if(S.nextLine().equals(a))
            {
                System.out.print("Welcome");
            }
            else
            {
                throw new Prashant("Authentication Failure");

            }
        }
        catch(Prashant P){
            System.out.println("Execption : "+ P);
        }

    }
}