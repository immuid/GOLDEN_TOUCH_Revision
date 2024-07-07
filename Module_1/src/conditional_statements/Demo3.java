package conditional_statements;
/**
 * This has a exampel
 * when we enter a number first
 * and if the second number is not odd number then the loop will not stop
 */
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		System.out.println("Enter an ODD Number when to stop iteration : ");
		int num2= scan.nextInt();
		while(true) {
			if(num%2==0) {
				System.out.println(num+" is an Even number ...");
//				num --;
//				continue;
			}else if(num==num2) {
				System.out.println("Job Over ...");
				break;
			}
			num--;
		}
	}

}
