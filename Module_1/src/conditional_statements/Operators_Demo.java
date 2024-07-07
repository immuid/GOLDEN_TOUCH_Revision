package conditional_statements;
/**
 * This class covers the concepts of 
 * Operators such as
 * Addition
 * Subtraction
 * Multiplication
 * Division
 */
import java.util.Scanner;

public class Operators_Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		System.out.println("Enter another number : ");
		int num2 = scan.nextInt();
		System.out.println("Select which opertion to perform : \n + \n - \n * \n / ");
		String option = scan.next();
		int result = 0;
		if(option .equalsIgnoreCase("+") ||option .equalsIgnoreCase("-")) {
			result = (option .equalsIgnoreCase("+")) ? (num + num2) : (num - num2);
			System.out.println("The result for the selected option is : " + result);
		}else if(option .equalsIgnoreCase("*") ||option .equalsIgnoreCase("/")) {
			result = (option .equalsIgnoreCase("*")) ? (num * num2) : (num / num2);
			System.out.println("The result for the selected option is : " + result);
		}else {
			System.out.println("Invalid operator selected .....");
		}
		
	}
}
