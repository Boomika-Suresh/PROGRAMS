
package javaapplication1;

    class student
    {
        String name;
        int Rollno;
        student(String n, int r)
        {
            this.name=n;
            this.Rollno=r;
        }
        void getName()
        {
            System.out.println("Name: "+name);
        }
        void getRollno()
        {
            System.out.println("Rollno: "+Rollno);
        }
    }
    class Result extends student
    {
        int mark1,mark2,mark3;
        Result(String n,int r,int m1,int m2, int m3)
        {
            super(n,r);
            this.mark1=m1;
            this.mark2=m2;
            this.mark3=m3;
        }
        void getmark1()
        {
            System.out.println("The mark1 is" + mark1);
        }
        void getmark2()
        {
            System.out.println("The mark2 is" + mark2);
        }
        void getmark3()
        {
            System.out.println("The mark3 is" + mark3);
        }
        void calculate()
        {
            int total=mark1+mark2+mark3;
            System.out.println("The total is" + total);
            if(total>=150)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        
    }
    class Sports extends Result
    {
        int sportsmark;
        
        Sports(String n,int r,int m1,int m2, int m3,int sportsmark)
        {
            super(n,r,m1,m2,m3);
            this.sportsmark=sportsmark;
        }
        void getsportsmark()
        {
            System.out.println("The sports mark is"+ sportsmark);
            
        }
        
        
    }
    public class modelStudent {
    public static void main(String args[])
    {
      Sports s=new Sports("Boomika",2,99,98,97,96);
      s.getName();
      s.getRollno();
      s.getmark1();
      s.getmark2();
      s.getmark3();
      s.calculate();
      s.getsportsmark();
    }
}
