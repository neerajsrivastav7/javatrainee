import java.util.*;
public class frist
{
  public static void main(String[] args)
   {
     Scanner sc1=new Scanner(System.in);
     String str=sc1.nextLine();
     int sc=0;
     int lc=0;
     int nc=0;
     int oc=0;
     int len=str.length();
     int i=0;
     while(i<len)
      {
         if(str.charAt(i)==' ')
         sc++;
         else if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
         lc++;
         else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
         nc++;
         else
         oc++;
         i++;
      }
   System.out.println("No of space is"+sc);
   System.out.println("No of letter is"+lc);
   System.out.println("No of number is"+nc);
   System.out.println("No of other character is"+oc);
   }
}
