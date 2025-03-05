package oops.practice.one;

import java.util.Scanner;

public class Creation {
	public static void main(String[] args) {
		Scanner fetch= new Scanner(System.in);
		
		System.out.println("Enter a name for the dog : ");
		
		String dogname=fetch.nextLine();
		Dog puppy=new Dog(dogname);
		
		System.out.println("\nEnter a name for the cat : ");
		
		String catname=fetch.nextLine();
		Cat tom= new Cat(catname);
		
		fetch.close();
		
		System.out.println(puppy.getName());
		puppy.makesound();
		System.out.println(tom.getName());
		tom.makeSound();
		}
}
