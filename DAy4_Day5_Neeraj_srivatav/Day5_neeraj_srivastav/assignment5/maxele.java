import java.util.*;

class Algorithm {
    public static <T extends Object & Comparable<? super T>>
        T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }
}
public class maxele
{
   public static void main(String[] args)
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the length of ArrayList:");
      n=sc.nextInt();
      ArrayList<Integer> arrli=new ArrayList<Integer>(n);
      for(int i=0;i<n;i++)
       {
         int val=sc.nextInt();
         arrli.add(val);
       }
     Algorithm a1=new Algorithm();
     int m=a1.max(arrli,0,n);
     System.out.print("Max element is:");
     System.out.println(m);
    }
}
