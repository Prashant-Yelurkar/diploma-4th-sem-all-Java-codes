class A 
{
    void display()
    {
        System.out.println("Class A Method");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("Class B Method");
    }
}
class C extends B
{
    void display()
    {
        System.out.println("Class C Method");
    }
}
class dynamic 
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;
        ref = a;
        ref.display();

        ref = b;
        ref.display();


        ref = c;
        ref.display();
        c.display();
    }
}