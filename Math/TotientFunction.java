import java.util.*;
import java.lang.*;

class testcase {
    
     static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    static long totient(long n)
    {
        long result = 1;
        for (long i = 2; i < n; i++)
            if (gcd(i, n) == 1)
                result++;
        return result;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long x = totient(n);
        System.out.println(x);
    }
    
}