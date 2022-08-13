import java.io.*;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {

        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        float num1,num2;
        System.out.print("Enter First Number  :");
        num1= Float.parseFloat(inp.readLine()); // for taking a number as an input 
        System.out.print("Enter Second Number  :");
        num2= Float.parseFloat(inp.readLine()); 

        System.out.print("\n\nAddition is : ");
        System.out.print(num1 + "  +  " + num2 + "  :  " + (num1+num2));

        System.out.print("\n\nSubstraction is : ");
        System.out.print(num1 + "  -  " + num2 + "  :  " + (num1-num2));

        System.out.print("\n\nMultiplicationis : ");
        System.out.print(num1 + "  *  " + num2 + "  :  " + (num1*num2));


        System.out.print("\n\nDivision is : ");
        System.out.print(num1 + "  /  " + num2 + "  :  " + (num1/num2));


        System.out.print("\n\nMod is : ");
        System.out.print(num1 + "  %  " + num2 + "  :  " + (num1%num2));
    }
}