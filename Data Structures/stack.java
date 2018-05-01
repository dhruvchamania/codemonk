import java.io.*;
import java.util.*;
import java.math.*;

class Simple {
    public static void main(String args[] ) throws Exception {
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int top=-1;
    int[] stack = new int[n];
    for(int i = 0; i < n; i++){
        int a = in.nextInt();
        if (a==1){
            if(top==-1)
            {
                System.out.println("No Food");
            }else{
                System.out.println(stack[top--]);
            }
        }else{
        int j= in.nextInt();
        stack[++top]=j;
        }
        }
    }
    
}
