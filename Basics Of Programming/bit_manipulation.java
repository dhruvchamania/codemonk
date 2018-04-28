import java.util.*;
import java.io.*; 

class countSetBits
{
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count+= n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int counter =0; counter <num; counter ++){
            int number = in.nextInt();
            System.out.println(countSetBits(number));
        }
        
    }
}
