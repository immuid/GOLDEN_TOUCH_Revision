package conditional_statements;
/**
 * This class covers the concpets of
 * Iterations using ForLoop
 */
import java.util.Scanner;

public class Iteration_Using_ForLoop {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number of iterations : ");
		int num= scan.nextInt();
		System.out.println("Enter an ODD Number when to stop iteration : ");
		int num2= scan.nextInt();
		for(int i=0;i<num;i++) {
			if(i%2==0) {
			System.out.println(i+" is an Even Number...");
			}else if(i==num2) {
				System.out.println ("Job Over...");
				break;
			}
			scan.close();
		}
	}

}
