package arrays;
/*
 * there are three types in arrays
 * 	1. Single dimensional array
 *  2. Two dimensional array
 *  3. Uneven Array or Multi dimensional array 
 */
public class UnevenArrays {
	
	int multiarray_v1[][]= {
			{10,9,8,7,6},
			{1,2,3},
			{4,5,7,6},
	};
	
	int unevenarray_V2[][]=new int[3][];//mentioning the row but not the columns 
		
	void unevenArray() {
		
		unevenarray_V2[0]=new int[5]; // declaring 5 no of column in 0th row 
		unevenarray_V2[1]=new int[3]; // declaring 3 no of column in 0th row
		unevenarray_V2[2]=new int[4]; // declaring 4 no of column in 0th row
		
// lets add values to the array matrix
		unevenarray_V2[0][0]=00;	unevenarray_V2[1][0]=10;	unevenarray_V2[2][0]=20;
		unevenarray_V2[0][1]=01;	unevenarray_V2[1][1]=11;	unevenarray_V2[2][1]=21;
		unevenarray_V2[0][2]=02;	unevenarray_V2[1][2]=12;	unevenarray_V2[2][2]=22;
		unevenarray_V2[0][3]=03;								unevenarray_V2[2][3]=23;
		unevenarray_V2[0][4]=04;
//		unevenarray_V2[0][5]=0; // throws array index out of bond exception..
		
		System.out.println("\n Values in uneven array : \n");
		for(int i=0;i<unevenarray_V2.length;i++) {
			
			for(int k=0;k<unevenarray_V2[i].length;k++) {
				System.out.print(unevenarray_V2[i][k]+"   ");
			}
			System.out.println();
		}
		
		
	}
	void multiArray() {
		System.out.println("Values in uneven array : \n");
		for(int i=0;i<multiarray_v1.length;i++) {
			for(int k=0;k<multiarray_v1[i].length ;k++){
				System.out.print(multiarray_v1[i][k]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		 UnevenArrays unarr=new UnevenArrays();
		 unarr.multiArray();
		 unarr.unevenArray();
	}
	

}
