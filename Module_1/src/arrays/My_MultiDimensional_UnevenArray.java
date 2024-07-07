package arrays;
/**
 * This class covers the concepts of
 * Array
 * MultiDimensional Array or Uneven Array
 * ForLoop (Normal)
 * ForLoop or ForEachLoop (Advanced)
 */
public class My_MultiDimensional_UnevenArray {

//	Two Dimensional array initialization
	int numberUnevenArray[][]= {
			{1,2,3,4,5},
			{6,7,8},
			{5,4,3,2},
			};
	int numberUnevenArray_V1[][]=new int[3][];
	
	void multiDimensionalUnevenArray() {
//  values are assigned for the Multi Dimensional   Uneven array inside a method 
		numberUnevenArray_V1[0] = new int[4];
		numberUnevenArray_V1[1] = new int[2];
		numberUnevenArray_V1[2] = new int[3];
		
		numberUnevenArray_V1[0][0]=0;	numberUnevenArray_V1[1][0]=4;	numberUnevenArray_V1[2][0]=8;
		numberUnevenArray_V1[0][1]=1;	numberUnevenArray_V1[1][1]=5;	numberUnevenArray_V1[2][1]=9;
		numberUnevenArray_V1[0][2]=2;									numberUnevenArray_V1[2][2]=1;
		numberUnevenArray_V1[0][3]=3;								
		
		System.out.println("looped normal Two Dimensional array using old for loop :-> \n");
//	Old for loop		
		for(int i=0;i<numberUnevenArray.length;i++) {
			for(int k=0;k<numberUnevenArray[i].length;k++) {
				System.out.print(numberUnevenArray[i][k]+"  ");
			}
			System.out.println("\n");
		}
		
		System.out.println("looped new Two Dimensional array using advanced for loop :-> \n");
//	New for loop
		for(int i[]:numberUnevenArray_V1) {
			for(int k:i) {
				System.out.print(k+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		My_MultiDimensional_UnevenArray MultiDimensionalUnevenArray=new My_MultiDimensional_UnevenArray();
		MultiDimensionalUnevenArray.multiDimensionalUnevenArray();
	}
}
