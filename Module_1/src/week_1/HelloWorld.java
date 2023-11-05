package week_1;

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
