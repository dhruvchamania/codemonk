import java.util.*;
import java.lang.*;

class testcase {
    
     static int even(int a)
    {
        if (a % 2 == 0)
            return 1;
        else
            return 0;
        
    }
    static int fact(int a)
    {
        int s=1;
        for(int i=1;i<=a;i++)
        {
            s=s*i;
            
        }
        return s;
        
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mul = s.nextInt();
        int counter= 0;
        for(int i = 0; i<n; i++){
           int x = s.nextInt();
            if(even(x)==1)
            counter++;
            }
        int d1,d2,n1;
        n1=fact(counter);
        d1=fact(mul);
        d2=fact(counter-mul);
        int answer=n1/(d1*d2);
        System.out.println(answer);
        }
        
}
