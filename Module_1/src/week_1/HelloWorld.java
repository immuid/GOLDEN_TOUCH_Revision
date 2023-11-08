package week_1;
//verified in GitHub

/*comments in java 
 * there are 3 types of comments in java 
 * 	1.SingleLine comment
 * 	2.Multiple Line comment
 * 	3.Documentary comment
 */

// Single Line Comment

/*
 * Multiple Line Comment
 */

/** Documentary Comment
 * @author imran ahmed M
 * 
 */

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hellow World...");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name= scan.next();
		scan.close();
		System.out.println("Welcome to JAVA Learning  :-> "+name);
	}

}
