class t1 extends Thread
{
    public void run()
    {
        for(int i = 0;i<=10;i= i+2)
        {
            try{
                System.out.print(i + "   ");
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error : " + e);
            }
        }
    }
}
class t2 extends Thread
{
    public void run()
    {
        for(int i = 1;i<=10;i= i+2)
        {
            try{
                System.out.print(i + "   ");
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error : " + e);
            }
        }
    }
}
class classRUN1
{
    public static void main(String args[])
    {
        t1 t = new t1();
        t2 tt = new t2();
        t.setPriority(Thread.MIN_PRIORITY);
        tt.setPriority(Thread.MAX_PRIORITY);
        tt.start();
        t.start();
        
        
    }
}