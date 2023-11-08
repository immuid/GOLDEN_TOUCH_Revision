package arrays;
/*
 * there are three types in arrays
 * 	1. Single dimensional array
 *  2. Two dimensional array
 *  3. Uneven Array or Multi dimensional array 
 */
public class UnevenArrays {
	int multiarray[][]= {
			{10,9,8,7,6},
			{1,2,3},
			{4,5,7,6},
	};
	
	void multiArray() {
		System.out.println("Values in uneven array : \n");
		for(int i=0;i<multiarray.length;i++) {
			for(int k=0;k<multiarray[i].length ;k++){
				System.out.print(multiarray[i][k]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		 UnevenArrays unarr=new UnevenArrays();
		 unarr.multiArray();
	}
	

}
