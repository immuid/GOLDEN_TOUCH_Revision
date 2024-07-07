package arrays;
/**
 * For Loops in Java 
 * 
 * There are 2 types of for loops in java 
 * 
 * 	1.Normal classic for loop :-> 
 * 		for(int i=0;i<5;i++){
 * 		System.out.println("Value of i is : "+i);
 * 		}
 * 	2.Advanced for loop introduced in Java 5.0 :->
 * 
 * 		for(int i:
 * 
 */

public class ForLoopsInArray { 
	int numbersArray[] = { 1, 2, 3, 4, 5, 6 };
	int number2DArray[][]= {
							{1,2,3,4,5},
							{6,7,8,9,0},
							{5,4,3,2,1},
							};
	//Method
	void normalForLoop() { //classic old normal for loop 
		System.out.println("looped Single Dimensional array using normal for loop :-> \n");
		
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + "  ");
		}
		System.out.println("\n");
		
		System.out.println("looped Two Dimensional array using normal for loop :-> \n");
		
		for(int i=0;i<number2DArray.length;i++) {
			for(int k=0;k<number2DArray[i].length;k++) {
				System.out.print(number2DArray[i][k]+"  ");
			}
			System.out.println("\n");
		}
	}
	
	//Method
	void advancedForLoop() { //Advanced for loop which was introduced in java 5.0
		System.out.println("looped Single Dimensional array using advanced for loop :-> \n");
		
		for(int i:numbersArray) {
			System.out.print(i+"  ");
		}
		System.out.println("\n");
		System.out.println("looped Two Dimensional array using advanced for loop :-> \n");
		
		for(int i[]:number2DArray) {
			for(int k:i) {
				System.out.print(k+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		
		ForLoopsInArray arrays=new ForLoopsInArray();
		
		arrays.normalForLoop();
		
		arrays.advancedForLoop();	
		
	}
}
