package constructors;

public class Constructor_Demo {
	public static void main(String[] args) {
		Human baby=new Human();
	}
}

class Human{
	public Human() { // constructor for the class Human
		System.out.println("Cyring is teached before birth ...");
	}
//	If we do not add a constructor Java by default adds a constructor
//	By adding the constructor we can able to write our login in it
}