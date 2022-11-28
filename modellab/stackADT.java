package javaapplication1;

import java.util.Scanner;

public class stackADT {
    public static void main(String [] args)
    {
      System.out.println("Enter the size of the stack:");
      Scanner sc1=new Scanner(System.in);
      int n=sc1.nextInt();
      stack1 s=new stack1(n);
      s.insert(0);
      s.insert(1);
      s.insert(2);
      s.insert(3);
      s.display();
      s.delete();
      s.display();
      s.peek();
      
    }
}
abstract class Stack
{
    public abstract void insert(int a);
    abstract void delete();
    abstract void display();
    abstract void peek();   
}
class stack1 extends Stack{
    int stack[];
    int size;
    int top=-1;
    stack1(int n)
    {
        size=n;
        stack=new int[size];
        top=-1;
    }
    @Override
    public void insert(int a)
    {
        if(top==stack.length)
        {
            System.out.println("Overflow");
        }
        else
        {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        int data=sc.nextInt();*/
    
        stack[++top]=a;
        
        
        }
    }
    @Override
    public void delete()
    {
        if(top==-1)
        {
            System.out.println("Empty");
        }
        else
        {
        System.out.println("The element deleted is "+stack[top]);
        top--;
        }
    }
    @Override
    public void display()
    {
        System.out.println("The stack is");
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }
    @Override
    public void peek()
    {
        System.out.println("The peek element is "+stack[top]);
    }
}