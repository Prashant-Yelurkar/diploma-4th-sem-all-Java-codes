class pre_post_in_de
{
    public static void main(String args[])
    {
        int a = 10;
        int y;
        System.out.println("Value of A is : " + a);
        y=++a;
        System.out.println("Result of pre increment is : " + y);
        System.out.println("Value of A is : " + a);
        y=a++;
        System.out.println("Result of post increment is : " + y);
        System.out.println("Value of A is : " + a);
        y=--a;
        System.out.println("Result of pre decrement is : " + y);
        System.out.println("Value of A is : " + a);
        y=a--;
        System.out.println("Result of post decrement is : " + y);
        System.out.println("Value of A is : " + a);

    }
}