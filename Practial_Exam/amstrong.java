import java.util.Scanner;
class amstrong
{
    public static void main(String args[])
    {
        int sum = 0;
        int remainder = 0;
        Scanner s  = new Scanner(System.in);
        int num ;
        System.out.print("Enter Number to check : ");
        num = s.nextInt();
        int num1 = num;
        int digit = 0;
        int digit1 =0;
        int add = 1;
        while(num>0)
        {
            num = num/10;
            digit++;
        }
        num = num1;
        while(num>0)
        {
            remainder = num%10;
            while(digit1<digit)
            {
                add = add * remainder;
                digit1++;
            }
            sum = sum + add;
            num = num/10;
            add = 1;
            digit1 =0;
        }
        
        if(sum == num1)
        {
           
            System.out.print(num1 + " is Armstrong number");
        }
        else
        {
            System.out.print(num1 + " is Not Armstrong number");
        }
    }
}