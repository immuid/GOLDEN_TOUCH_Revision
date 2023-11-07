package week_1;
//verified in GitHub
public class ArrayDemo {
	
	int i=10; // we can only instantiate variables inside the class 
			 //we need methods to perform operation using the variables 
	
	int mark[]= {10,20,30,40}; // single dimensional array
	
	int array[]=new int[5]; //array with 1 ROW and 5 COLUMNS initiated
	
	void arr() {
		array[0]=80; //values have been set to the array indexes 
		array[1]=95;
		array[2]=74;
		array[3]=82;
		array[4]=75;
		 System.out.println(" Values in the array : \n");
		for(int i=0;i<5;i++) {
			System.out.println("array["+i+"] = "+array[i]);
			
		}
		System.out.println();
	}
	
	void marks() {
		System.out.println(" Marks in the Array : \n");
		
		for(int i=0;i<mark.length;i++) {
			System.out.println("Mark in array["+i+"] = "+array[i]);
		}
	}
	
	public static void main(String[] args) {
	ArrayDemo ard =	new ArrayDemo();
	ard.arr();
	ard.marks();
		
	}

}
