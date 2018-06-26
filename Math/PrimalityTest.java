
import java.util.*;
import java.lang.*;

class testcase {
     
    static boolean isprime(long n)
    {
    
        if (n <= 1)  return false;
        if (n <= 3)  return true;
        if (n%2 == 0 || n%3 == 0) return false;
 
    for (long i=5; i*i<=n; i=i+6)
        if (n%i == 0 || n%(i+2) == 0)
           return false;
 
    return true;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int counter =0;
        for(int i = 0; i<n; i++){
            long chk;
            chk = s.nextInt();
            if(isprime(chk))
            System.out.println("prime");
            else
            System.out.println("composite");
            } 
          
    }
    
}
