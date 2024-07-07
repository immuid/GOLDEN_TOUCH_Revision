package polymorphism;
/**
 * The below example is using Object oriented programming
 * Polymorphism
 * Variable Arguments
 */
public class MethodPolymorphism {
	
	void met(){
		System.out.println("Method without parameter...");
	}
	
	void met(int i) {
		System.out.println("Method with parameter....");
	}
	
	void met(int i,String s) {
		System.out.println("Method with parameter....");
	}
/**
 * Example for VariableArguments	
 * @param i
 */
	public void met(int...i) {
		System.out.println("Viral arguments method....");
		
		for(int s:i) {
			System.out.print(s+" ");
		}
	}
	
	public void met(String...str) {
		System.out.println("Viral arguments method....");
		
		for(String i:str) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

/**
 * methods with array parameter and return type
 * @param args
 */
	public void metArray(int[] i) {
		for(int k:i) {
			System.out.print(k+"\t ");
		}
		System.out.println();
	}
	
	public int[] metArray() {
		int arr1[]= {2,5,7,4};
		return arr1;
	}
	
	public MyType complexTypeMethod(MyType... mytp) {
		return new MyType();
	}
	public static void main(String[] args) {
		MethodPolymorphism obj= new MethodPolymorphism();
		
		obj.met();
		obj.met(10);
		obj.met(10,"hello");
		obj.met(1,2,3,4);
		obj.met("hai","hello","welcome","to","java");
		
		int arr[]= {34,28,93,47};
		obj.metArray(arr);
		int kk[]=obj.metArray();
		
		obj.complexTypeMethod(new MyType() ,new MyType(),new MyType());
	}
}
//By default all classes are complex type
class MyType{
	
}