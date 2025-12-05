package BasicJavaActivity3;
import java.util.Scanner;

public class BasicJavaActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
    	System.out.print("Enter first integer: ");
    	int int1 = input.nextInt();
    	System.out.println("");
    	
       	System.out.print("Enter second integer: ");
    	int int2 = input.nextInt();
    	System.out.println("");
    	
    	int sum = int1 + int2;
    	int diff = int1 - int2;
    	int prod = int1 * int2;
    	
    	System.out.println("Sum: " + sum);
    	System.out.println("");
    	System.out.println("Difference: " + diff);
    	System.out.println("");
    	System.out.println("Product: " + prod);
    	System.out.println("");
    	
		
	}

}
