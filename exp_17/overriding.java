class Superclass
{
    void display()
    {
        System.out.println("Super Class");
    }
}
class Subclass extends Superclass
{
    void display()
    {
        System.out.println("Sub Class");
    }
}
class overriding
{
    public static void main(String args[])
    {
        Superclass obj = new Superclass();
        obj.display();
        Superclass obj1 = new Subclass();
        obj1.display();
    }
}