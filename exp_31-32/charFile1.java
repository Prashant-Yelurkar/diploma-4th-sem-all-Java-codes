import java.io.*;
public class charFile1
{
	public static void main(String[] args)throws IOException
	{
		FileReader in = null;
        FileWriter out = null;
        try {

			in = new FileReader("me.txt"); // assigning file in read mode
            out = new FileWriter("me1.txt");
			int temp;
			while ((temp = in.read()) != -1) // reading file
                out.write(temp);
                
		    System.out.println("\n\nProgram successfully executed");
		}
		finally {

			// Closing stream as no longer in use
			if (in != null)
				in.close();
            if (out != null)
				out.close();
		}
	}
}
