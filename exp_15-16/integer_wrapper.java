import java.lang.*;
class integer_wrapper
{
    public static void main(String args[])
    {
        int a = 10;
        System.out.println("Integer Value : " + a);
        String s = "10";
        System.out.println("String Value : " + s);
        Integer i = Integer.valueOf(s);
        System.out.println("Addition of Integer and String Value : " + (a+s));
        System.out.println("String value converted into Integer value : " + i);
        System.out.println("Addition of Integer and converted Value : " + (a+i));
    }
}