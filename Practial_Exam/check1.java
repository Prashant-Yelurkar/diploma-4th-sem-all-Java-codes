import java.util.Scanner;
class check1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str ;
        System.out.print("Enter String : ");
        str = s.nextLine();
        int i =0;
        int j = str.length() - 1;
        boolean flage = false;
        while(i<(str.length()-1))
        {
            if(str.charAt(i)!= str.charAt(j))
            {
                flage = true;
                System.out.print("Enter String is Not palendrom ");
                break;
            }
            i++;
            j--;
        }
        if(flage!=true)
        {
            System.out.print("Enter String is palendrom ");
        }

    }
}