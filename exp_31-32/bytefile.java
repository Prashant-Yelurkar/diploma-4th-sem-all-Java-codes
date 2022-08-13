import java.io.*;
public class bytefile{
	public static void main(String[] args)throws IOException
	{
		FileInputStream in = null;
        FileOutputStream out = null;
        try {

			in = new FileInputStream ("me1.txt"); // assigning file in read mode
            out = new FileOutputStream("me3.txt"); //assigning file in Write mode
			int temp;
			while ((temp = in.read()) != -1) // reading file
            {
				System.out.println(temp);//printing charcter file contant 
            }
            String str = "Prashant Erappa";
            byte b[] = str.getBytes();
            out.write(b);
                
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
