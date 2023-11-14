package access_specifier.package_2;

import access_specifier.package_1.AccessSpecifier;

public class AccessSpecifier_DfferentPackage_SubClass extends access_specifier.package_1.AccessSpecifier{
	
	void accessTest() { 
		System.out.println(private_variable);  //class scope -> accessible (visible) only in same class
		System.out.println(protected_variable);//relationship scope ->accessible (visible) in same class and subclass
		System.out.println(nomodifier_variable);//package scope ->accessible (visible) in same class, subclass and non-subclass in same package
	    System.out.println(public_variable);	///public scope ->accessible (visible) in every where
	}
	
}

class AccessSpecifier_DfferentPackage_NonSubClass{
	
	AccessSpecifier access=new AccessSpecifier();
	
	void accessTest() { 
		System.out.println(access.private_variable);  //class scope -> accessible (visible) only in same class
		System.out.println(access.protected_variable);//relationship scope ->accessible (visible) in same class and subclass
		System.out.println(access.nomodifier_variable);//package scope ->accessible (visible) in same class, subclass and non-subclass in same package
	    System.out.println(access.public_variable);	///public scope ->accessible (visible) in every where
	}
}
