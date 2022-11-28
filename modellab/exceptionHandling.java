package javaapplication1;

import java.util.Scanner;

class myException extends Exception
{
    public myException(String s)
    {
        super(s);
    }
}
public class exceptionHandling {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.next();
        try
        {
           if(word.equals("Hello"))
           {
               throw new myException("EXCEPTION OCCURRED");
           }
           else
           {
               System.out.println("The entered word is "+ word);
           }
        }
        catch(myException e)
        {
           System.out.println(e.getMessage());
                   
        }
        System.out.println("Enter integer 1:");
        String a=sc.next();
        System.out.println("Enter integer 2:");
        String b=sc.next();
        try
        {
            int x1=Integer.parseInt(a);
            int x2=Integer.parseInt(b);
            int x3=x1+x2;
            System.out.print(x3);
        }
        catch(NumberFormatException e)
        {
            try
            {
                throw new myException("Wrong Characters");
            }
            catch(myException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    
        }
    }
}

