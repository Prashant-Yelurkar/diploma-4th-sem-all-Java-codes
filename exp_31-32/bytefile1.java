import java.io.*;
public class bytefile1{
	public static void main(String[] args)throws IOException
	{
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("me3.txt"); //assigning file in Write mode
            String str = "Prashant Erappa Yelurkar";
            byte b[] = str.getBytes();
            out.write(b);
                
		    System.out.println("\n\nProgram successfully executed");
		}
		finally {
            if (out != null)
				out.close();
		}
	}
}
