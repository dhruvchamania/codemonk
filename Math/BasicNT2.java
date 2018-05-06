import java.util.*;
import java.lang.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int counter =0;
        for(int i = 2; i<(n+1); i++){
            int chk;
            chk =prime(i);
            if(chk==1){
                counter++;
            }
        }
        System.out.println(counter);
    }
    
    static int prime(int n){
        for (int i = 2; i * i <= n; ++i) {
        if (n % i == 0) {
            return 0;
        }
    }
        return 1;
    }
}
