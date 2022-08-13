interface area
{
    void display();
}
class rectangle 
{
    int l,b;
    rectangle(int le, int br )
    {
        l = le;
        b = br;
    }
}
class circle extends rectangle implements area
{
    int radius;
    double area;
    circle(int le,int br,int r)
    {
        super(le,br);
        radius = r;
    }
    public void display()
    {
        area = l*b;
        System.out.println("Area Of Rectangle is : "+ area);
        area = (3.14*radius*radius);
        System.out.println("Area Of Circle is : "+ area);

    }
}
class findarea
{
    public static void main(String args[])
    {
        circle c = new circle(10,20,5);
        c.display();
    }
}