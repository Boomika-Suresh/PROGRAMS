package javaapplication1;

import java.io.IOException;

class myException extends Exception
{
    myException(String s)
    {
        super(s);
    }
}
public class primeno {
    public static void main (String args[]) throws IOException
    {
        int a,b;
        a = Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        System.out.println("The prime numbers are:");
        try
        {
            if(a>=0&&b>=0)
            {
                if(b>a)
                {
                    for(int i=a;i<b;i++)
                    {
                        if(i==2||i==3||i==5||i==7)
                        {
                            System.out.println( i);
                        }
                        else
                        {
                            if(i%2==0||i%3==0||i%5==0||i%7==0)
                            {
                                System.out.println(i);
                            }
                            else
                            {
                                throw new myException("Second number must be larger than the first number");
                            }
                        }
                    }
                }
                else
                {
                    throw new myException("Both numbers must be larger than 0");
                }
            }
        }
        catch(myException e)
        {
            System.out.println(e);
        }
        
        
    }
    
}
