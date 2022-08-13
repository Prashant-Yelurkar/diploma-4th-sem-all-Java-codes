public class SwitchCaseExample1
{
    public static void main (String args[])
    {
        int num =2;
        switch(num+2)
        {
            case 1:
                System.out.println("Case 1: Value is : "+num);
            case 2:
                System.out.println("Case 2: Value is : "+num);
            case 3:
                System.out.println("Case 3: Value is : "+num);
            default:
                System.out.println("Default Value is : "+num);
        }
    }
}