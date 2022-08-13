class BOB
{
    void display()
    {
        System.out.println("Bank of Baroda");
        System.out.println("Rate of Interest is : 5.8\n");
    }
}
class UBI extends BOB
{
    void display()
    {
        System.out.println("Union Bank of India");
        System.out.println("Rate of Interest is : 5.9\n");
    }
}
class Vijaya extends BOB
{
    void display()
    {
        System.out.println("Vijay Bank");
        System.out.println("Rate of Interest is : 4.8");
    }
}
class overriding2
{
    public static void main(String args[])
    {
        BOB b = new BOB();
        b.display();
        UBI u = new UBI();
        u.display();
        Vijaya v = new Vijaya();
        v.display();
    }
}