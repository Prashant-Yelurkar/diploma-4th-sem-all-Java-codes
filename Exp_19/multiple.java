interface Animal
{
    void animal();
}
interface Men
{
    void name();
}
class Pet implements Animal,Men
{
    public void name()
    {
        System.out.print("\n\nPrashant has an Pet and his name is ");
    }
    public void animal()
    {
        System.out.print("Rocky\n\n");
    }
}
class multiple 
{
    public static void main(String args[])
    {
        Pet p = new Pet();
        p.name();
        p.animal();
    }
}