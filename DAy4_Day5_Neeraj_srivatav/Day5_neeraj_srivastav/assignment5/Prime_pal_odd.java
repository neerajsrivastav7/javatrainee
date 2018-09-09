import java.util.*;
interface up<T> {
    public boolean test(T obj);
}
class OddPredicate implements up<Integer> {
    public boolean test(Integer i) { return i % 2 != 0; }
}
class prime  implements up<Integer>
{
   boolean flag=true;
   public boolean test(Integer i)
     {
        for(int j=2; j<=Math.sqrt(i); ++j)
          {
            if((i%j)==0)
               {
                 flag=false;
                 return flag;
               }
         }
        return flag;
       } 
}
class palindrum implements up<Integer>
{
   public boolean test(Integer i)
    {
            int oI= i,r,rI=0;
            while( i!=0 )
               {
                 r = i%10;
                 rI = rI*10 + r;
                 i/= 10;
             }
         if(oI==rI)
         return true;
         else
         return false;
     }
}
class Algorithm {
    public static <T> int countIf(Collection<T> c, up<T> p) {

        int count = 0;
        for (T elem : c)
             {
            boolean f1=p.test(elem);
            if (f1)
                ++count;
           }
        return count;
    }
}

public class Prime_pal_odd {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(10, 15,212,15,33,55);
        OddPredicate e1=new OddPredicate();
        int count1 = Algorithm.countIf(ci,e1);
        System.out.println("Number of odd integers = " + count1);
        prime  e2=new prime();
        int count2 = Algorithm.countIf(ci,e2);
        System.out.println("Number of prime integers = " + count2);
        palindrum  e3=new  palindrum();
        int count3 = Algorithm.countIf(ci,e3);
        System.out.println("Number of palindrum integers = " + count3);
    }
}

