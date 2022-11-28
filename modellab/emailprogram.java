package javaapplication1;

import java.util.Scanner;

public class emailprogram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName=sc.next();
        System.out.println("Enter the last name: ");
        String lastName=sc.next();
        email e=new email(firstName,lastName);
        e.emailDisplay();
    }
    
}
class email
{
    String firstName;
    String lastName;
    email(String a,String b)
    {
       this.firstName=a;
       this.lastName=b;
    }
    
    void emailDisplay()
    {
        String sub1=firstName.substring(0, 3);
        String sub2=lastName.substring(0, 4);
        System.out.println(sub1+sub2+"."+"@gmail.com");
    }
}