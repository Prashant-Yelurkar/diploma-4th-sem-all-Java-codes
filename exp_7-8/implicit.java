class implicit
{
    public static void main( String args [])
    {
        byte a = 15;
        System.out.println("Implicit type casting"+ "\n");
        System.out.println("Byte Value : " + a);

        short b = a;
        System.out.println("Short Value : " + b);

        int c = b;
        System.out.println("Integer Value : " + c);

        long d = c;
        System.out.println("log Value : " + d);

        float e = d;
        System.out.println("Float Value : " + e);

        double f = e;
        System.out.println("Double Value : " + f);
    }
}