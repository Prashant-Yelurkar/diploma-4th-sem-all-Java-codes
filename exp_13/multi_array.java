import java.util.Scanner;
class multi_array
{
    public static void main(String args[])
    {
        int row,col;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Rows in array : ");
        row = s.nextInt();
        System.out.print("Enter Number of Cloums in array : ");
        col = s.nextInt();
        int array[][]= new int[row][col];
        System.out.println("Enter Element of array : ");

        for(int i = 0; i<row ; i++)
        {
            for(int j = 0; j<col; j++)
            {
                array[i][j] = s.nextInt();
            }
        }

        System.out.println("\n\nElement of 2D array :");
        for(int i = 0; i<row ; i++)
        {
            for(int j = 0; j<col; j++)
            {
                System.out.print(array[i][j]+ "   ");
            }
            System.out.print("\n");
        }
    }

}