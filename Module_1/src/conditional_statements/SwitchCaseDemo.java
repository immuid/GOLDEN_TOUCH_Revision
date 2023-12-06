package conditional_statements;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		SwitchCaseDemo obj= new SwitchCaseDemo();
		Scanner scan= new Scanner(System.in);
		char b;
		int days=366;
		String value="helloWorld";
		
		System.out.println("Choose any character : \n a b c  ");
		String str= scan.next();
		b=str.charAt(0);
		scan.close();
		
		obj.switchCharDemo(b);
		obj.switchIntDemo(days);
		obj.switchStringDemo(value);
	}
	
	void switchStringDemo(String s) {
		switch (s) {
		case "helloWorld":{
			System.out.println("The value is helloWorld ... \n");
			break;
		}
		case "hello":{
			System.out.println("The value is hellow ...\n");
			break;
		}default:
			break;
		}
	}
	void switchIntDemo(int i) {
		switch (i) {
		case 366: {
			System.out.println("It is a Leap year ... \n");
			break;
		}
		default:
			System.out.println("It is a Default block ... \n");
			System.out.println("It is not a Leap year ... \n");
			break;
		}
	}
	void switchCharDemo(char b) {
	    switch (b) {
	        case 'a' : {
	            System.out.println("The value is a ...");
	            System.out.println("You have choosen the correct answer it's aaaaaaa... \n");
	            break;
	        }
	        case 'b' : {
	            System.out.println("The value is b ... \n");
	            break;
	        }
	        case 'c' : {
	            System.out.println("The value is c ... \n");
	            break;
	        }
	        default:
	            System.out.println("Unexpected value: " + b);
	            System.out.println("This is the default block ... \n");
	            break;
	    }
	}

}
