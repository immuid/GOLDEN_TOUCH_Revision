package arrays;

public class MySingleDimensionalArrays {

//	Single Dimensional array initialization
	int numbersArray[] = { 1, 2, 3, 4, 5, 6 };
	int numbersArrays_V1[]=new int[7];
	
	void singleDimensionalArray() {
		
//  values are assigned for the Single Dimensional array inside a method 	
		numbersArrays_V1[0]=0;
		numbersArrays_V1[1]=1;
		numbersArrays_V1[2]=2;
		numbersArrays_V1[3]=3;
		numbersArrays_V1[4]=4;
		numbersArrays_V1[5]=5;
		numbersArrays_V1[6]=6;
		
		System.out.println("looped normal Single Dimensional array using old for loop :-> \n");
		
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print(numbersArray[i] + "  ");
		}
		System.out.println("\n");
		
		System.out.println("looped new Single Dimensional array using advanced for loop :-> \n");
		
		for(int i: numbersArrays_V1){
			System.out.print(i + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MySingleDimensionalArrays singleDArray=new MySingleDimensionalArrays();
		singleDArray.singleDimensionalArray();
	}
}
