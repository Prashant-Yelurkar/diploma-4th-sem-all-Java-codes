class Nesting
{
    int m,n;
    Nesting(int x, int y)
    {
        m = x;
        n = y;
    }
    int large()
    {
        if(m>n)
            return(m);
        else
            return(n);
    }
    void display()
    {
        int large = large();
        System.out.println("Largest Value is : "+ large);
    }
}
class NestingTest
{
    public static void main(String args [])
    {
        Nesting Nest = new Nesting(10,20);
        Nest.display();
    }
    
}