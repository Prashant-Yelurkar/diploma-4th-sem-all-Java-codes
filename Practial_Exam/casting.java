class casting
{
    public static void main(String args[])
    {
        System.out.println("\n\nImplicit Typecasting : \n\n");
        byte b = 12;
        System.out.println("Byte : " + b);

        short s = b;
        System.out.println("Short : " + s);

        int i = s;
        System.out.println("Integer : " + i);

        long l = i;
        System.out.println("Long : " + l);

        float f = l;
        System.out.println("Float : " + f);

        double d = f;
        System.out.println("double : " + d);


        System.out.println("\n\nExplicit Typecasting : \n\n");
        double d1 = 12.3658923589866225;
        System.out.println("double : " + d1);

        float f1  = (float)d1;
        System.out.println("float : " + f1);

        long l1  = (long)f1;
        System.out.println("Long : " + l1);        

        int i1  = (int)f1;
        System.out.println("int : " + i1);

        short s1  = (short)i1;
        System.out.println("short : " + s1);

        byte b1  = (byte)s1;
        System.out.println("byte : " + b1);
    }
}