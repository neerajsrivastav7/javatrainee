import java.util.*;

class TestBounded<E extends Number>{
	E e1;
	E e2;
	public void set(E e1,E e2)
	{
		this.e1=e1;
		this.e2=e2;
	}
	public Number get()
	{
		return (Number)(e1.doubleValue()+e2.doubleValue());
	}
}
public class  addTwoNumberG
{
     public static void main(String[] args)
      {
         TestBounded<Float> t1=new TestBounded<Float>();
         Float a1=(float) 2,a2=(float) 5;
         t1.set(a1,a2);
         float res=t1.get().floatValue();
         System.out.println(res);
         TestBounded<Integer> t2=new TestBounded<Integer>();
         Integer a3=5,a4=6;
         t2.set(a3,a4);
         int res1=t2.get().intValue();
         System.out.println(res1);
      }
}


