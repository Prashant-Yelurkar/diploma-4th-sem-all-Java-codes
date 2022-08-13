class minimum
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]); //take argument as command line
        int b = Integer.parseInt(args[1]); //take argument as command line
        int c = Integer.parseInt(args[2]); //take argument as command line

        if((a<b) && (a<c))
        {
            System.out.println(" Minimum  : "+a);
        }
        else if((b<a) && (b<c))
        {
            System.out.println(" Minimum  : "+b);
        }
        else
        {
            System.out.println(" Minimum  : "+c);
        }
    }
}