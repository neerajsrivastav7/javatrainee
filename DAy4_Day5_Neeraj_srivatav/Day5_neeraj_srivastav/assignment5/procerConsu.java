import java.util.*;
import java.util.Scanner; 
class producer
{
   int n;
   producer()
   {
   }
   producer(int n)
   {
      this.n=n;
   }
   class data
     {
        String name;
        int rollno;
        String Address; 
        data(String name,int rollno,String Address)
          {
             this.name=name;
             this.rollno=rollno;
             this.Address=Address;
          }        
     }
  ArrayList<data> arrli=new ArrayList<data>(n);
  public void setStu(String name,int rollno,String Address)
    {
       data d2=new data(name,rollno,Address);
       arrli.add(d2);
    }
  public void getStu1()
   {
     for(int i=0;i<n;i++)
      {
        data d1=arrli.get(i);
        System.out.println(d1.name+"  "+d1.rollno+" "+d1.Address);
      }
   }
}
public class procerConsu 
{
   public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the size of list:");
        n=sc.nextInt();
        String name;
        int rollno;
        String Address;
        producer p1=new producer(n);
        for(int i=0;i<n;i++)
          {
             System.out.println("enter the name of student");
             name=sc.next();
             System.out.println("enter the rollno of student");
             rollno=sc.nextInt();
             System.out.println("enter the Address of student");
             Address=sc.next();
             p1.setStu(name,rollno,Address);
          }
     System.out.println("Consumer is reading:");
     p1.getStu1();
       
     }
}
