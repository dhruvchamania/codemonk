import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        
        
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                int a = s.nextInt();
                arr[i][j]=a;
            }
        }
         for (int j=0; j<m; j++)
        {
            for (int i=0; i<n; i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
