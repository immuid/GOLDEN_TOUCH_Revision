package access_specifier_package_1;

public class AccessSpecifier {
	//variable declaration 
	private   int private_variable;   //class scope -> accessible (visible) only in same class
	protected int protected_variable; //relationship scope ->accessible (visible) in same class and subclass
			  int nomodifier_variable;//package scope ->accessible (visible) in same class, subclass and non-subclass in same package
	public    int public_variable;	  ///public scope ->accessible (visible) in every where
	
	//method
	void accessTest() { 
		System.out.println(private_variable);
		System.out.println(protected_variable);
		System.out.println(nomodifier_variable);
	    System.out.println(public_variable);
	}
}

class AccessSpecifier_SubClass extends AccessSpecifier{
	
	void accessTest() {
		System.out.println(private_variable);
		System.out.println(protected_variable);
		System.out.println(nomodifier_variable);
	    System.out.println(public_variable);
	}
	
}

class AccessSpecifier_NonSubClass{
	
	AccessSpecifier access=new AccessSpecifier();
	void accessTest() {
		System.out.println(access.private_variable);
		System.out.println(access.protected_variable);
		System.out.println(access.nomodifier_variable);
	    System.out.println(access.public_variable);
	}
}
