package week_1;

public class TwoDimensionalArray {
		int Array2D_v1[][]= {  //two dimensional array with 2 rows and 4 columns
				{10,20,30,40},
				{90,80,70,60},
		};
		
		int Array2D_V2[][]=new int[2][4];
		
		void array2d_v1() {
			System.out.println("Values in 2d array v1 : \n");
			
			for(int i=0;i<Array2D_v1.length;i++) {			// This loops around 4 times
				for(int k=0;k<Array2D_v1[i].length;k++) {  //This loops around 4*4 = 16 times 
					System.out.print(Array2D_v1[i][k]+" "); 
				}
				System.out.println();
			}
		}
		
		void array2d_v2() {
			System.out.println("\nValues in 2d array v2 : \n ");
			
			for(int i=0;i<Array2D_V2.length;i++) {
				for(int k=0;k<Array2D_V2[i].length;k++) {
					System.out.print(Array2D_V2[i][k]+" ");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			TwoDimensionalArray ArrayTypes =new TwoDimensionalArray();
			ArrayTypes.array2d_v1();
			ArrayTypes.array2d_v2();
		}
}
