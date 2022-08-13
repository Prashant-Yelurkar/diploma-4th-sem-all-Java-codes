class Even implements Runnable
{
    public void run()
    {
        for(int i = 0;i<=10;i = i + 2)
        {
            try{
                System.out.println("Even Number :"+ i);
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println("Error:" + e);
            }
        }
    }
}
class Odd implements Runnable
{
    public void run()
    {
        for(int i = 1;i<=10;i = i + 2)
        {
            try{
                System.out.println("Odd Number :"+ i);
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println("Error:" +e);
            }
        }
    }
}
class classRUN
{
    public static void main(String args[])
    {
        Even e = new Even();
        Thread t1 = new Thread(e);
        
        Odd o = new Odd();
        Thread t2 = new Thread(o);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        
    }
}