class constructor
{
    private String Name;
    private int Age;
    constructor(String na , int ag)
    {
        Name = na;
        Age = ag;
    }
    void display()
    {
        System.out.println("Name : "+ Name);
        System.out.println("Age  : "+ Age + "\n");
    }
    constructor(constructor t1)
    {
        this.Name = t1.Name;
        this.Age = t1.Age;
    }
}
class twoconstructor
{
    public static void main( String arg[])
    {
        constructor t1 = new constructor("Prashant", 17);
        System.out.println("\n"+"This is original Object created with Parameterized constructor"+"\n");
        t1.display();
        constructor t2 = new constructor(t1);
        System.out.println("This is duplicte Object created with Copy constructor"+"\n");
        t2.display();
    }
}
