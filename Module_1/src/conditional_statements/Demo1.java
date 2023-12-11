package conditional_statements;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		System.out.println("Enter another number : ");
		int num2 = scan.nextInt();
		System.out.println(
				"Select which opertion to perform : \n 1.For adding two numbers \n 2.For mu,tiplying two numbers  ");
		int option = scan.nextInt();

		int result = (option == 1) ? (num + num2) : (num * num2);
		System.out.println("The result for the selected option is : " + result);
	}
}
