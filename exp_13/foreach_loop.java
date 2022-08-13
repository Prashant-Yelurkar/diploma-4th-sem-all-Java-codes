import java.util.Scanner;
class foreach_loop
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nEnter size of array : ");
        int element = s.nextInt();
        int array[] = new int[element];

        System.out.print("\nEnter Element of array : ");
        for(int i =0;i<element;i++)
        {
            array[i] = s.nextInt();
        }

        System.out.println("\nDisplay Element of array using For-each loop : ");
        for(int a : array)
        {
            System.out.print(a + "  ");
        }

    }
}