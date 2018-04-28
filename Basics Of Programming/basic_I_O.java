import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String name = in.nextLine();                 
        System.out.println(num*2);
        System.out.print(name);

     
    }
}

