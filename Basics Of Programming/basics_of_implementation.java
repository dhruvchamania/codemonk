import java.util.scanner;



class TestClass {
    public static void main(String args[] ) throws Exception {
    
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int remainder = 0;
    int[] digits = new int[10];
    while(num>0){
        remainder = num/10;
        digits[remainder]++;
        num = num/10;
    }
    
    for (int counter = 0; counter<10;counter ++){
        int digitCount = digits[counter];
		
			System.out.println(counter + "\t" + digitCount);
		}
    }
    }
}
