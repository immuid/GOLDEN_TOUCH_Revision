package variable_scope;
/*
 * Types of Variable and its Scope
 * 	1.Class Variable - are Static Variable
 * 	2.Instance Variable
 * 	3.Local Variable
 */
public class Variable_Scope_And_Types {
	public static void main(String[] args) {
		TrainingRoom Hall1=new TrainingRoom();
			Hall1.Teach();
			Hall1.Teach();
			Hall1.Teach();
		TrainingRoom Hall2=new TrainingRoom();
			Hall2.Teach();
			Hall2.Teach();
	}

}

class TrainingRoom{
	public TrainingRoom() { 
		System.out.println("Training Room Object is Created ...");
	}
	Projector pro= new Projector();    //Instance Variable - object is created every time when class is called
	static Toilet toilet= new Toilet();//Class Variable    - object is created only once because its static
	void Teach() {
		Student stu= new Student();	   //Local Variable	   - object is created each time the method is called 
	}
}
class Toilet{
	public Toilet() {
		System.out.println("Toilet Object Created ...");
	}
}
class Projector{
	public Projector() {
		System.out.println("Projector Object Created ...");
	}
}
class Student{
	public Student() {
		System.out.println("Student Object Created ...");
	}
}
