package conditional_statements;

import java.util.Scanner;

public class TernaryDemo {
	public static void main(String[] args) {
		//? - ternary operator
		String result=(10<20)?"10 is lesser than 20 ":"it is not lesser than 20 ";
//		(expression) ? "true" : "false" ;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int i = scan.nextInt();
		
		String OddEven=(i%2==0)?"Even number ":"Odd number";
		System.out.println(OddEven);
		scan.close();
	}
}
