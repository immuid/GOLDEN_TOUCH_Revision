package inheritance;
/**
 * This class covers the concepts of
 * Association
 * Pass By Reference
 */
public class Inheritance_Association {
	public void eatLaddu(Laddu laddu) {
		System.out.println("Laddu is eaten half.. ");
		laddu.setSize(laddu.size/2);
	}
	public static void main(String[] args) {
		Laddu laddu= new Laddu(); // Inheritance_Association has the knowledge of laddu 
		laddu.setSize(10);
		System.out.println("before eating laddu the size is "+laddu.size);
		
		Inheritance_Association Asso= new Inheritance_Association();
//		passing the object by reference.
		Asso.eatLaddu(laddu);
		System.out.println("after eating laddu the size is "+laddu.size);
	}
}

class Laddu{
	int size;
	public void setSize(int s) {
		size=s;
	}
}