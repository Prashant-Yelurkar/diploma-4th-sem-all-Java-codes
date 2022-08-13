import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int array[][] = new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("Enetr element of array[" + i + "][" + j + "] : ");
                array[i][j]=s.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array[i][j]+"   ");
            }
            System.out.println("");
        }

    }
}