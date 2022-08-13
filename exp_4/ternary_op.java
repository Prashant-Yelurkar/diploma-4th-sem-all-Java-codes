class ternary_op
{
    public static void main(String args[])
    {
        int a = 10;
        String b ;
        System.out.println("a = "+ a + "\n");
        b = ( a == 10)? "True" : "False";
        System.out.println("Value of a is equal to 10 ? :"+ b);
        b = ( a != 10)? "True" : "False";
        System.out.println("Value of a is not equal to 10 ? :"+ b);
    }
}