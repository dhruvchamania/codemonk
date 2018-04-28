import java.io.*;
import java.util.*;
import java.math.*;

class Simple {
    public static void main(String args[] ) throws Exception {
    
    Scanner in = new Scanner(System.in);
    BigInteger num = in.nextBigInteger();
    BigInteger f = new BigInteger("0");
    BigInteger bi1,bi3;

    bi1 = new BigInteger("10");
   
    int remainder = 0;
    int[] digits = new int[10];
    while(num.compareTo(f) > 0){
    	bi3 = num.mod(bi1);
        remainder =  bi3.intValue();
        digits[remainder]++;
        num = num.divide(bi1);
    }
    
    for (int counter = 0; counter<10;counter ++){
        int digitCount = digits[counter];
	System.out.println(counter + " " + digitCount);
    }
    
    }
}
