public class primenumber 
{ 
    static int sum=0;
    static void sieveOfEratosthenes(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        {
            if(prime[p] == true) 
            { 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        }  
        int count=0;
        for(int i = 2; count<=100; i++) 
        { 
            if(prime[i] == true)
              { 
                System.out.print(i + " ");
                sum=sum+i;
                 count++; 
              }
        }
   }
  static public int getSum()
    {
      return sum;
    } 
      
    public static void main(String args[]) 
    { 
        int n =1000; 
        primenumber g = new primenumber(); 
        g.sieveOfEratosthenes(n);
        g.getSum();
        System.out.println("sum of number is:"+sum); 
    } 
} 
  
