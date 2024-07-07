package inheritance;
/**
 * This class covers the concepts of
 * Inheritance
 * Generalization
 */
public class Inheritance_Generalization {

	public static void main(String[] args) {
		Employee eng = new Engineer(); // here Employee is the parent class which accepts the child classes -> Engineer/Attender
		Employee atd = new Attender();

	}

}
//Parent class Employee
class Employee {

}

/**
 * Inheritance or Generalization
 */
//Child class of Employee
class Engineer extends Employee {// Child is a kind of parent, Child can replace parent...
	public Engineer() {
		System.out.println("Engineer is employeed...");
	}
}
//Child class of Employee
class Attender extends Employee {
	public Attender() {
		System.out.println("Attender is employeed...");
	}
}