import java.util.Scanner;
public class SquareRoot { 
    public static void main(String[] args)  
    { 
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num= sc.nextInt();
        double sr = Math.sqrt(num);      
        System.out.println("The Square Root of " +num+ " = "+sr); 
    
    } 
}