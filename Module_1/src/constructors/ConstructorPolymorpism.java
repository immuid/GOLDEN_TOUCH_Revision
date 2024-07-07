package constructors;

/**
 * This class covers the concept of
 * Constructor Overloading
 * Polymorphism
 */
public class ConstructorPolymorpism {
	public ConstructorPolymorpism() {
		System.out.println("default Constructor called...");
	}

	public ConstructorPolymorpism(int i) {
		System.out.println("int parameter Constructor called...");
	}

	public ConstructorPolymorpism(String s) {
		System.out.println("String parameter Constructor called...");
	}

	public ConstructorPolymorpism(int i, String s) {
		System.out.println("int and string parameter Constructor called...");
	}

	public static void main(String[] args) {
		ConstructorPolymorpism obj1 = new ConstructorPolymorpism();

		ConstructorPolymorpism obj2 = new ConstructorPolymorpism(10);

		ConstructorPolymorpism obj3 = new ConstructorPolymorpism("hai");

		ConstructorPolymorpism obj4 = new ConstructorPolymorpism(10, "hai");

	}

}
