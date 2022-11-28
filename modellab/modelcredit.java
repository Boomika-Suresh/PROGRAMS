
package javaapplication1;
import java.util.Scanner;
public class modelcredit {
    public static void main(String [] args)
    {
       Scanner sc1=new Scanner(System.in);
       System.out.println("Enter the number of customers:");
       int num=sc1.nextInt();
       customer obj[]=new customer[num];
       for(int j=0;j<num;j++)
       {
        System.out.println("Enter the name:");
        String name=sc1.next();
         System.out.println("Enter the card number:");
        int no=sc1.nextInt();
        System.out.println("Enter the pin number:");
        int pin=sc1.nextInt();
        System.out.println("Enter the credit Amount:");
        int credit=sc1.nextInt();
        obj[j]=new customer(name,no,pin,credit); 
        obj[j].viewCreditAmount();
        obj[j].viewPin();
        obj[j].changePin();
        obj[j].payBalance(100);
        
       }
       
    }
    
}
interface creditCardInterface
{
    public void viewCreditAmount();
    public void viewPin();
    public void changePin();
    public void payBalance(int n);
}
class customer implements creditCardInterface
{
    String name;
    int cardnumber;
    int pin;
    int creditAmount;
    customer(String a,int b,int c,int d)
    {
        this.name=a;
        this.cardnumber=b;
        this.pin=c;
        this.creditAmount=d;
    }
    @Override
    public void viewCreditAmount()
    {
       System.out.println(creditAmount); 
    }
    @Override
    public void viewPin()
    {
        System.out.println(pin); 
    }
    @Override
    public void changePin()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the current pin:");
       int a=sc.nextInt();
       System.out.println("Enter the new pin:");
       int b=sc.nextInt();
       System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
       
    }
    @Override
    public void payBalance(int a)
    {
       if(creditAmount!=0)
       {
           creditAmount=creditAmount -a;
           System.out.println("Balance: "+ creditAmount);
       }
       else
       {
         System.out.println("Balance"+creditAmount);
       }
    }

}
        