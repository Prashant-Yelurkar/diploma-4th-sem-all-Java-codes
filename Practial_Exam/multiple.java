interface h1
{
    void display();
    
}
interface h2
{
    void getdata();
    
}
class multiple1 implements h1,h2
{
    public void display()
    {
        System.out.println("h1 interface");
    }
    public void getdata()
    {
        System.out.println("h2 interface");
    }
}
class multiple
{
    public static void main(String args[])
    {
        multiple1 m = new multiple1();
        m.display();
        m.getdata();
    }
}