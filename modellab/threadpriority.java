package javaapplication1;
import java.lang.*;
public class threadpriority {
    public static void main (String args[])
    {
        threading t1=new threading();
        threading t2=new threading();
        threading t3=new threading();
        t1.start();
        t1.setPriority(10);
        System.out.println("Current thread:"+Thread.currentThread().getPriority());
        t2.start();
        t3.start();
        
        t2.setPriority(1);
        t3.setPriority(8);
        
        System.out.println("Current thread:"+Thread.currentThread().getPriority()); 
        System.out.println("Current thread:"+Thread.currentThread().getPriority());
    }
}
class threading extends Thread
{
   
   public void run()
   {
      System.out.println("Execution starts");
   }
}
        