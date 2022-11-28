/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
interface QueueOperations
{
    public void enqueue(int a);
    public void dequeue();
    public void display();
    public void peek();
}
class MyQueue implements QueueOperations
{
    int queue[];
    int n;
    int front;
    int rear;
    int data;
    MyQueue(int arr_size)
    {
        n=arr_size;
        queue=new int[n];
        front=0;
        rear=-1;
    }
    @Override
    public void enqueue(int a)
    {
        data=a;
        if(rear==n-1)
        {
          System.out.println("QUEUE IS IN OVERFLOW CONDITION");
        }
        else
        {
            //rear=rear+1;
            queue[++rear]=data;
        }
    }
    @Override
    public void dequeue()
    {
        if(front==n)
        {
            System.out.println("UNDERFLOW");
        }
        else
        {
            System.out.println("The element deleted is"+queue[front]);
            front=front+1;
        }
    }
    @Override
    public void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    @Override
    public void peek()
    {
        System.out.println(queue[front]);
    }
}
 public class modelnterface {
     public static void main(String args[])
     {
         MyQueue m=new MyQueue(5);
         m.enqueue(0);
         m.enqueue(1);
         m.enqueue(2);
         m.enqueue(4);
         
         m.display();
         m.dequeue();
         m.peek();
     }
    
}
