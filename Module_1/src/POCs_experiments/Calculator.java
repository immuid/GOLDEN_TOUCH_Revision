package POCs_experiments;

import java.util.Scanner;

public class Calculator {
	Scanner scan;
	public static void main(String[] args) {
		
		Calculator calci = new Calculator();
		calci.execute();
	}

	void execute() {
		int num1, num2;
		String operator;
		Calculator calci = new Calculator();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value : ");
		num1=input.nextInt();
		System.out.println("Choose the Operator: +, -, /, * ");
		operator=input.next();
		System.out.println("Enter the value : ");
		num2=input.nextInt();
		input.close();
		System.out.println("num1 is : "+num1+" operator is "+operator+" num2 is : "+num2);
		calci.start(num1, operator, num2);		
	}
	
	void start(int num1, String operator ,int num2) {
		Calculator calci = new Calculator();
		
		if(operator.equals("+")) {
			int total=calci.add(num1, num2);
			System.out.println("\n The addition of "+num1+" and "+num2+" is :"+total);
		}else if(operator.equals("-")) {
			int total=calci.sub(num1, num2);
			System.out.println("\n The subtraction of "+num1+" and "+num2+" is :"+total);
			
		}else if(operator.equals("/")) {
			 if (num2 != 0) {
	                double total = calci.div(num1, num2);
	                System.out.println("\nThe division of " + num1 + " and " + num2 + " is: " + total);
	            } else {
	                System.out.println("Error: Division by zero");
	            }
		}else if(operator.equals("*")) {
			int total=calci.mul(num1, num2);
			System.out.println("\n The multiplication of "+num1+" and "+num2+" is :"+total);
		}else {
			System.out.println("Oops ... there is some issue retry ...");
		}
	}

	int add(int a, int b) {
		int Addition = a + b;
		return Addition;
	}

	int sub(int a, int b) {
		int Subraction = a - b;
		return Subraction;
	}

	double div(int a, int b) {
		double Division = a / b;
		return Division;
	}

	int mul(int a, int b) {
		int Multipy = a * b;
		return Multipy;
	}
}
