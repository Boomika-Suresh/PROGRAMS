
package javaapplication1;
import java.util.Scanner;

public class model1 {
    public static void main(String args[])
    {
     float marks[]=new float[10];
     float total=0;
     float avg;
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++)
     {
         int a=i+1;
         System.out.println("Enter subject "+ a + " marks:");
         marks[i]=sc.nextInt();
         total += marks[i];
     }
     System.out.println("The total marks is "+ total);
     avg = total / 5;
     if(avg>=91&&avg<=100)
    {
       System.out.println("Grade O and Grade point is 10");
    }
     else if(avg>=81&&avg<=90)
    {
       System.out.println("Grade A+ and Grade point is 9");
    }
    else if(avg>=71&&avg<=80)
    {
       System.out.println("Grade A and Grade point is 8");
    }
     else if(avg>=61&&avg<=70)
    {
       System.out.println("Grade B+ and Grade point is 7");
    }
     else if(avg>=50&&avg<=60)
    {
       System.out.println("Grade B and Grade point is 6");
    }
     else if(avg<50)
    {
       System.out.println("Grade RA and Grade point is 0");
    }
    
}
}
