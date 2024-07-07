package conditional_statements;
/**
 * This class has the concept of
 * If condition
 * If Else If condition
 * Using a concept of checking the i value ..
 */
public class If_Else_Demo {
	public static void main(String[] args) {
		int i= 15;
		int j= 16;
		int k= 10;
		int l= 22;
		boolean valid = true;
		String s="hello";
		
		If_Else_Demo If_Else_Demo=new If_Else_Demo();
		If_Else_Demo.ifElseDemo(i);
		If_Else_Demo.ifElseDemo(j);
		
		If_Else_Demo.ifElseDemo1(k);
		If_Else_Demo.ifElseORDemo2(i);
		If_Else_Demo.ifElseANDDemo3(l);
		
		If_Else_Demo.ifBooleanDemo(valid);
		If_Else_Demo.StringDemo(s);
		
	}
		
		
	String ifElseDemo(int i) {
		String result;
		System.out.println("This method checks the i value is 15 or not ...");
		if(i==15) {
			result=" Value of i is equal to 15 ... \n";
			System.out.println(result);
		}
		else {
			result=" Value of i is not equal to 15 ... \n";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifElseDemo1(int i) {
		String result = null;
		System.out.println("This method checks whether i value is lesser than 20 or erual to 10 or greater than 20 ...");
		
		if(i<20) {
			result=" Value of i is lesser than 20 ... \n";
			System.out.println(result);
		}
		else if(i==10) {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is not equal to 10 ... \n";
			System.out.println(result);
		}else {
			result="Value of i is greater than 20 ... \n";
			System.out.println(result);
		}
		return result;
	}
	
	String ifElseORDemo2(int i) {
		String result = null;
		System.out.println("This method used to represent OR condition ...");
		if(i<10 || i>20) {
			result=" Value of i is lesser than 10 ... or greater than 20 ... \n";
			System.out.println(result);
		}
		else {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is greater than 10 ... and lesser than 20 ... \n";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifElseANDDemo3(int i) {
		String result = null;
		System.out.println("This method used to represent AND condition ...");
		if(i%2==0 && i>20) {
			result=" Value of i is greater than 20 ... and divisible by 2 \n";
			System.out.println(result);
		}
		else {  // this condition is not executed when the first condition is satisfied ...
			result=" Value of i is either lesser than 20 ... or divisible by 2 \n";
			System.out.println(result);
		}		
		return result;
	}
	
	String ifBooleanDemo(boolean value) {
		String result;
		System.out.println("This method used to represent boolean condition ...");
		if(value) {
			result="The boolean is valid ... \n";
		System.out.println(result);
		}else {
			result="The boolean is not valid ... \n";
		}
		return result;
	}
	
	void StringDemo(String s) {
		System.out.println("This method is used to represent String demo ...");
		if(s.equalsIgnoreCase("Hello")) {
			System.out.println("The value of s is Hello \n");
		}
		else if(s.equals("hello")) {
			System.out.println("The value of s is Hello \n");
		}else {
			System.out.println("The value not matched \n");
		}
	}
}
