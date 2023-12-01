package conditional_statements;

import java.util.Scanner;

public class If_Demo {
	public static void main(String[] args) {
		new If_Demo().execute();
	}

	void execute() {
		int i;
		int method;
		Scanner scan = new Scanner(System.in);

		If_Demo if_Demo = new If_Demo();

		method = if_Demo.chooseMethod();
		if (method == 1) {
			System.out.println("Enter the Value of i : ");
			i = scan.nextInt();
			if_Demo.ifDemo(i);
		} else if (method == 2) {
			System.out.println("Enter the Value of i : ");
			i = scan.nextInt();
			if_Demo.ifElseDemo(i);
		} else {
			System.out.println("Enter valid method number .. 1 or 2 ");
		}

		scan.close();
	}

	int chooseMethod() {
		int methodNumber;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. To check the value of i < 20, i = 10, i > 5 ");
		System.out.println("2. To check the value of i is equal to 15 or not ");
		System.out.println("Enter which method to use : ");
		methodNumber = scan.nextInt();
		if (methodNumber == 1) {
			return methodNumber;
		} else if (methodNumber == 2) {
			return methodNumber;
		} else {
			System.out.println("Enter valid method number .. 1 or 2 ");
		}

		return methodNumber;
	}

	void ifDemo(int i) {
		System.out.println("\n This method is used to check the value of i < 20, i = 10, i > 5 ....");
		if (i < 20) {
			System.out.println("Value of i is lesser than 20 ...");
		}
		if (i == 10) {
			System.out.println("Value of i is equal to 10 ...");
		}
		if (i > 5) {
			System.out.println("Value of i is greater than 5 ...");
		}
	}

	String ifElseDemo(int i) {
		String result;
		System.out.println("\n This method is used to check the value is equal to 15 or not ...");
		if (i == 15) {
			result = "\n Value of i is equal to 15 ... ";
			System.out.println(result);
		} else {
			result = "\n Value of i is not equal to 15 ... ";
			System.out.println(result);
		}
		return result;
	}
}
