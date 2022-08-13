import java.io.*; 
class FileOutput
{
    public static void main (String args[])
    {
        FileOutputStream out; 
        PrintStream p;
        try
        {
            Out = new FileOutputStream(); 
            p=new PrintStream(out); 
            p.println("This is written to a file");
            p.close();
        }
        catch(Exception e)
        {
            System.err.println("Error writing to a file");
        }
    }
}