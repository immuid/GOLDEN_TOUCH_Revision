package access_specifier_package_2;

import access_specifier_package_1.AccessSpecifier;

public class AccessSpecifier_DfferentPackage_SubClass extends access_specifier_package_1.AccessSpecifier{
	
	void accessTest() {
/**
		The field AccessSpecifier.private_variable is not visible
		System.out.println(private_variable);  //class scope -> accessible (visible) only in same class		
		The field AccessSpecifier.nomodifier_variable is not visible
		System.out.println(nomodifier_variable);//package scope ->accessible (visible) in same class, subclass and non-subclass in same package
*/	
		System.out.println(protected_variable);//relationship scope ->accessible (visible) in same class and subclass
		System.out.println(public_variable);	///public scope ->accessible (visible) in every where
	}
	
}

class AccessSpecifier_DfferentPackage_NonSubClass{
	
	AccessSpecifier access=new AccessSpecifier();
	
	void accessTest() { 
/**		
  		The field AccessSpecifier.private_variable is not visible
		System.out.println(access.private_variable);  //class scope -> accessible (visible) only in same class
		The field AccessSpecifier.protected_variable is not visible
		System.out.println(access.protected_variable);//relationship scope ->accessible (visible) in same class and subclass
		The field AccessSpecifier.nomodifier_variable is not visible
		System.out.println(access.nomodifier_variable);//package scope ->accessible (visible) in same class, subclass and non-subclass in same package
*/	    
		System.out.println(access.public_variable);	///public scope ->accessible (visible) in every where
	}
}
