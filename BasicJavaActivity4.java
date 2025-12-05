package BasicJavaActivity4;
import java.util.Scanner;

public class BasicJavaActivity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		
		int age = input.nextInt();
		String range;
		
		if (age < 18)
			range = "Minor";
		else if (age > 59)
			range = "Senior";
		else
			range = "Adult";
		
		System.out.println("");
		System.out.print(range);
	}
	
		

}
