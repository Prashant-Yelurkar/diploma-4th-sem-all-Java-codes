class MyBaseClass
{
    protected void dsip()
    {
        System.out.println("Parent class method");
    }
}
class MyChildClass extends MyBaseClass
{
     protected void dsip()
    {
        System.out.println("Child class method");
    }
    public static void main(String args[])
    {
        MyChildClass obj = new MyChildClass();
        obj.dsip();
    }
}