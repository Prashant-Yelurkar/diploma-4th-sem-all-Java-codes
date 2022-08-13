class Thread1 extends Thread
{
    public void run()
    {
        for(int p = 0;p<5;p++)
        {
            System.out.println("Class Tread1");
            try{
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println("Class Tread2");
            try{
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        for(int j = 0;j<5;j++)
        {
            System.out.println("Class Tread3");
            try{
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }
}
class setpriority
{
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY); 
        System.out.println("Priority of thread t1 is: " + t1.getPriority());   
        System.out.println("Priority of thread t2 is: " + t2.getPriority());  
        System.out.println("Priority of thread t3 is: " + t3.getPriority());      
        t1.start();
        t2.start();
        t3.start();

    }
}