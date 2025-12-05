package BasicJavaActivity2;
import java.util.Scanner;

public class BasicJavaActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
    	System.out.print("What is your age? ");
    	String age = input.nextLine();
    	System.out.println("");
    	
    	int age1 = Integer.parseInt(age);
    	double age2 = Double.parseDouble(age);
    	
    	System.out.println("Your age as int: " + age1);
    	System.out.println("");
    	
    	System.out.println("Your age as double: " + age2);
    	System.out.println("");
	}

}
