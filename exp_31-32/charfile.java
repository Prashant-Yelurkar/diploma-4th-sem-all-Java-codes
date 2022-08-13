import java.io.*;
public class charfile{
	public static void main(String[] args)throws IOException
	{
		FileReader in = null;
        FileWriter out = null;
        try {

			in = new FileReader("me.txt"); // assigning file in read mode
			int temp;
			while ((temp = in.read()) != -1) // reading file
				System.out.print((char)temp);//printing charcter file contant 

                
            out = new FileWriter("me1.txt"); //assigning file in Write mode
            String text  = "Prashnat Erappa Yelurkar"; 
            out.write("Prashnat Erappa Yelurkar");//Writing into file
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
