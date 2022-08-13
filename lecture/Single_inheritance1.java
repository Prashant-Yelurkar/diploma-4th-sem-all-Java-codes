import java.lang.*;
class sphere
{
    int r;
    float pi;
    sphere(int r, float pi)       //super class constructor
    {
        this.r=r;
        this.pi=pi;
    }
    void volume()                           //method to display volume of sphere
    {                
        float v=(4*pi*r*r)/3;
        System.out.println("Volume of Sphere : "+v);
    }
}
class hemisphere extends sphere //subclass defined
{
    hemisphere(int r, float pi)
    {
        super(r,pi);
    }
    void volume()                           //method to display volume of hemisphere
    {
        super.volume();
        float v=(2*pi*r)/3;
        System.out.println("Volume of Hemisphere : "+v);
    }
}
class Single_inheritance1
{
    public static void main(String args[]) //main method
    {
        hemisphere h=new hemisphere(10, 3.14f);
        h.volume();
    }
}