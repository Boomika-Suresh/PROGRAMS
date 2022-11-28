package javaapplication1;
public class generic {
   public static void main(String[] args) 
   {
       Integer num[]={1,2,3,4,5};
       ex <Integer> i=new ex<Integer>();
       i.odd(num);
       Integer num1={4,5,6,7,8};
       ex2<Double> i1=new ex2<Do>uble>();
       i1.swap(num2);
              
   }
}
class ex<T>
{
    public static<T> void odd(T [] a)
    {
        
        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+ " is an odd number");
            }
            else
            {
                System.out.println(i+ " is an even number");
            }
        }
    }
}
class ex2<T extends Number>
{
    
    public static <T> void swap(T[] a, K b,C c)
    {
            T temp=a[b];
            a[b]=a[c];
            a[c]=temp;
            
            
        
    }
}