class Rectangle
{
        int length,  width;
        Rectangle(int x, int y)
        {
            length = x;
            width =y;
        }
        int rectarea()
        {
            return(length * width);
        }
}
class rectanglearea
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(15,10);
        int area = r1.rectarea();
        System.out.println("Area is : " + area);
    }
}