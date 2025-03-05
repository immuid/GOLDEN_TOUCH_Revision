package week_1;
/**
 * This class covers the concepts of Classes and Objects..
 * Using school and fee example..
 * @author imranahmedm
 */
/*public class School {
	
	void admission() { //method without parameter and return type
		System.out.println("admission done...");
	}
	
	int fee(int money) { //method with parameter and return type
		 System.out.println("Collects the Fees Money : "+money +" and returns the Change...");
		 if(money>500) {
			 admission();
			 return money-200;
		 }
		 else if(money==500) {
			 admission();
			 return money-150;
		 }
		 else {
			 admission();
			 return money-100;
		 }
		 
	 }
	 
	 int askDonation() {//method with return type but without parameter
		 System.out.println("donated 100 rupees");
		 return 100;
	 }
	 
	 public static void main(String[] args) { //Main Method to execute the program
		 
		 School school=new School();
		 
		 int fee_change = school.fee(500);
		 
		 int donate=school.askDonation();
		 
		Human immu=new Human(); //object created with reference
		immu.smile(); // object behavior is called using object reference name
		
		new Human().smile();
		 
//		 System.out.println("school fees_change : "+fee_change);
		System.out.println("school fees_change : "+school.fee(400));
		 System.out.println("school Donates : "+donate);
//		 school.admission();
	}

}
 class Human{
	 
	 void smile() {
		 System.out.println("Smiling is a noble act...eeee");
	 }
 }*/

public class School{
	
	void admission() {
		System.out.println("Admission done for the student...");
	}
	int fee(int money) {
		int change;
		if(money>500)change=money-200;
		else if (money==500)change=money-150;
		else if (money<500&&money >99)change=money-100;
		else change=money;
		
		if(money<100) {System.out.println("money is not enough ..");}
		else {admission();System.out.println("collects the fee from "+money+" and returns the change "+change);}
		
		return change;
	}
	
	public static void main(String[] args) {
		new School().fee(502);
	}
}