import java.io.*;
class commandl
{
    public static void main(String[] args)
    {
        FileInputStream in = null;
        try
        {
            in = new FileInputStream(args[0]);
            int c;
            while((c=in.read())!=-1)
                System.out.print((char)c);
            in.close();
        }
            catch(Exception e)
        {}
    }
}
