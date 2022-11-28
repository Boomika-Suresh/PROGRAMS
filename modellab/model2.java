package javaapplication1;
import YEAR_1.Year1marks;
import YEAR_2.Year2Marks;
import java.util.Scanner;
public class model2 {
   public static void main(String[] args)
   {
       Year1marks y1=new Year1marks();
       Year2Marks y2=new Year2Marks();
       Scanner sc=new Scanner(System.in);
       int Rollno[] = new int[5];
       String name[]=new String[5];
       int mark1[]=new int[5];
       int mark2[]=new int[5];
       int mark3[]=new int[5];
       int mark4[]=new int[5];
       for(int i=0;i<5;i++)
       {
         System.out.println("Enter Roll No:");
         Rollno[i]=sc.nextInt();
         System.out.println("Enter Name:");
         name[i] = sc.next();
         System.out.println("Enter sub 1 marks:");
         mark1[i]=sc.nextInt();
         y1.submark1(mark1[i]);
         System.out.println("Enter sub 2 marks:");
         mark2[i]=sc.nextInt();
         y1.submark2(mark2[i]);
         System.out.println("Enter sub 3 marks:");
         mark3[i]=sc.nextInt();
         y2.submark3(mark3[i]);
         System.out.println("Enter sub 4 marks:");
         mark4[i]=sc.nextInt();
         y2.submark4(mark4[i]);
         
         
         
       }
       
   }
   
}
