import java.io.*;
import java.util.*;
import java.math.*;

class Simple {
    public static void main(String args[] ) throws Exception {
    
    Scanner in = new Scanner(System.in);
    BigInteger a = in.nextBigInteger();
    int b = in.nextInt();
    BigInteger c = in.nextBigInteger();
    BigInteger m = in.nextBigInteger();
    
    a=a.pow(b);
    a=a.divide(c);
    a=a.mod(m);
    System.out.print(a);
    
    
    }
}
