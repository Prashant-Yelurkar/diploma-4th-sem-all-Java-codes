import java.util.Scanner;
class InvalidEmailException extends Exception
{
    InvalidEmailException(String s)
    {
        super(s);
    }
}
class check 
{ 
    public static void main(String args[])
    {
        Boolean flag1 = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Enetr Email Id : ");
        String email = s.nextLine();
        try{
            for(int i = 0; i<email.length();i++)
            {
                Boolean flag = Character.isDigit(email.charAt(0));
                if(flag)
                {
                    throw new InvalidEmailException("Email can not start with digit");
                }
                if(email.charAt(i)=='@')
                {
                    flag1= true;
                }
            }
            if(!flag1)
            {
                throw new InvalidEmailException("Email id must contain @ symbol");
            }
            else
            {
                System.out.print( email +" is Vaild Email id ");
            }
        }
        catch(InvalidEmailException a)
        {
            System.out.println(a);
        }
        


    }
}