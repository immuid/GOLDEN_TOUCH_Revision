package conditional_statements;

public class If_Else_Demo {
	public static void main(String[] args) {
		int i= 15;
		int j= 16;
		int k= 10;
		
		If_Else_Demo If_Else_Demo=new If_Else_Demo();
		If_Else_Demo.ifElseDemo(i);
		If_Else_Demo.ifElseDemo(j);
		
		If_Else_Demo.ifElseDemo1(k);
	}
		
		
	String ifElseDemo(int i) {
		String result;
		if(i==15) {
			result=" Value of i is equal to 15 ... ";
			System.out.println(result);
		}
		else {
			result=" Value of i is not equal to 15 ... ";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifElseDemo1(int i) {
		String result = null;
		if(i<20) {
			result=" Value of i is lesser than 20 ... ";
			System.out.println(result);
		}
		else if(i==10) {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is not equal to 10 ... ";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifElseDemo2(int i) {
		String result = null;
		if(i<10 || i>20) {
			result=" Value of i is lesser than 10 ... or greater than 20 ... ";
			System.out.println(result);
		}
		else {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is greater than 10 ... and lesser than 20 ";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifElseDemo3(int i) {
		String result = null;
		if(i%2==0 && i>20) {
			result=" Value of i is greater than 20 ... and divisible by 2 ";
			System.out.println(result);
		}
		else {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is either lesser than 20 ... or divisible by 2 ";
			System.out.println(result);
		}		
		return result;
	}
}
