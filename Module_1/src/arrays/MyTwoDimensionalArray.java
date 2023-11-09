package arrays;

public class MyTwoDimensionalArray {

//	Two Dimensional array initialization
	int number2DArray[][]= {
			{1,2,3,4,5},
			{6,7,8,9,0},
			{5,4,3,2,1},
			};
	int number2DArray_V1[][]=new int[3][4];
	
	void twoDimensionalArray() {
//  values are assigned for the Two Dimensional array inside a method 	
		number2DArray_V1[0][0]=0;	number2DArray_V1[1][0]=4;	number2DArray_V1[2][0]=8;
		number2DArray_V1[0][1]=1;	number2DArray_V1[1][1]=5;	number2DArray_V1[2][1]=9;
		number2DArray_V1[0][2]=2;	number2DArray_V1[1][2]=6;	number2DArray_V1[2][2]=1;
		number2DArray_V1[0][3]=3;	number2DArray_V1[1][3]=7;	number2DArray_V1[2][3]=2;
		
		System.out.println("looped normal Two Dimensional array using old for loop :-> \n");
//	Old for loop		
		for(int i=0;i<number2DArray.length;i++) {
			for(int k=0;k<number2DArray[i].length;k++) {
				System.out.print(number2DArray[i][k]+"  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("looped new Two Dimensional array using advanced for loop :-> \n");
//	New for loop
		for(int i[]:number2DArray_V1) {
			for(int k:i) {
				System.out.print(k+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		MyTwoDimensionalArray twoDimensionalArray=new MyTwoDimensionalArray();
		twoDimensionalArray.twoDimensionalArray();
	}
}
