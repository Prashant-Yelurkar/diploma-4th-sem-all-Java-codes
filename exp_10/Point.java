class Point 
{
    int m_x, m_y;
    Point()
    {}
    public Point(int x, int y)
    {
        m_x = x;
        m_y = y;
    }
    public static void main(String args[])
    {
        Point P1 = new Point();
        Point p = new Point(2,3);
        System.out.println("X"+p.m_x);
        System.out.println("y"+p.m_y);
        System.out.println("X"+P1.m_x);
        System.out.println("y"+P1.m_y);
    }
}