class thread1 extends Thread
{
    
    thread1()
    {
         new Thread("thread1");
        start();
    }

    public void run()
    {  
	 while(true)
	{
         try
         {
            System.out.println("BMS College Of Engineering");
            Thread.sleep(10000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}

class thread2 extends Thread
{
    
    thread2()
    {
        new Thread("thread2");
        start();

    }

    public void run()
    {   while(true)
	{
         try
         {
            System.out.println("CSE");
            Thread.sleep(2000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}

class threadmain
{
    public static void main(String args[])
    {
       System.out.println("Enter CONTROL+C to stop");
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

    }
}