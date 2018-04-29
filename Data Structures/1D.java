import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            int a = s.nextInt();
            arr[i]=a;
        }
        for (int i=n-1; i>-1; i--)
        {
            
            System.out.println(arr[i]);
        }
    }
}
