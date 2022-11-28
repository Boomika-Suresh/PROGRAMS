package javaapplication1;
import java.util.Scanner;
public class modelCar {
    public  static void main(String [] args)
    {
        System.out.print("Enter the number of vehicles");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        car obj[]=new car[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("1.Transport Vehicles\n2.Private Vehicles");
        System.out.println("enter choice: ");
        int ch=sc.nextInt();
        if(ch==1)
        {
            
            System.out.println("Enter the validity number:");
            int a=sc.nextInt();
            System.out.println("Enter the start date:");
            int b=sc.nextInt();
            System.out.println("Enter the Period:");
            int c=sc.nextInt();
            obj[i]=new transportVehicles(a,b,c);
            System.out.println(obj[i]);
        }
        else
        {
            System.out.println("Enter the Owner name:");
            String name=sc.next();
            System.out.println("Enter the Owner address:");
            String add=sc.next();
            obj[i]=new privateVehicles(name,add);
            System.out.println(obj[i]);
        }
        }
    }
    
}
abstract class car
{
    String reg_no;
    String model;
    String reg_date;
}
class transportVehicles extends car
{
    int Validity_no;
    int start_date;
    int period;
    transportVehicles(int a,int b, int c)
    {
        this.Validity_no=a;
        this.start_date=b;
        this.period=c;
    }
    @Override
    public String toString()
    {
        return "VALIDITY NO:"+Validity_no+"START DATE: "+ start_date+ "PERIOD: "+period;
    }
            }
class privateVehicles extends car
{
   
    String owner_name;
    String owner_address;
    privateVehicles(String a,String b)
    {
        this.owner_name=a;
        this.owner_address=b;
    }
    @Override
    public String toString()
    {
        return "REGISTER NO:"+reg_no+"MODEL: "+ model+ "REGISTER DATE: "+reg_date+ "OWNER NAME: "+ owner_name+"OWNER ADDRESS: "+ owner_address;
    }
}

