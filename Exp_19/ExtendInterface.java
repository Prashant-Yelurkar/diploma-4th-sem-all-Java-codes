interface NewShape
{
    void draw();
}
interface Circle 
{
    void gerRadius();
    int radius =10;
}
class NewCircle implements Circle
{
    public void gerRadius()
    {
        System.out.println(radius);
    }
}
class ExtendInterface extends NewCircle
{
    public static void main(String args[])
    {
        NewCircle nc  = new NewCircle();
        nc.gerRadius();
    }
}