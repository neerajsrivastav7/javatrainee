/*
   Binary search  in array list
*/
import java.io.*; 
import java.util.*;
class ArrayList1
{
   public int n;
   ArrayList<Integer> arrli = new ArrayList<Integer>(n);
   ArrayList1(int n)
   {
      this.n=n;
   }
   public void setArray(int val)
    {
       arrli.add(val);
    }
  public void getList()
    {
      System.out.println("The list is:");
      System.out.println(arrli);
    }
  public void sort()
    {
      Collections.sort(arrli); // sorting of array list
    }
  public int search(int val1,int l,int h)// binary search on array list by recursion
   {
        if(h>=l)
          {
            int mid=((l+h)/2);
            if(arrli.get(mid)==val1)
            return mid;
            if(arrli.get(mid)<val1)
            return search(val1,mid+1,h); 
            return search(val1,l,mid-1);
           }
         return -1;
   }
}
class SearchBinaryRec
{ 
    public static void main(String[] args) 
                       throws IOException 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array list:");
        int n=sc.nextInt();
        ArrayList1 e1=new ArrayList1(n);
        System.out.print("Entered list is:");
        for(int i=0;i<n;i++)
          {
             int val=sc.nextInt();
             e1.setArray(val);
          }
        e1.getList();
        System.out.println("sorting of array list");
        e1.sort();
        System.out.println("List after sorting");
        e1.getList();
        System.out.println("enter the value to be search");
        int val1=sc.nextInt();
        int index=e1.search(val1,0,n-1);
        if(index==-1)
        System.out.println("The element is not in list:");
        else
        System.out.println("Index of the element is "+(index));
    }
}
          
