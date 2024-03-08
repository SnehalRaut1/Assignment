package assignmentToSend;
/*Assignment 17:Write a program with 2 Static method,2 
Non-Static method,and one Constructor*/
public class Static_Nonstatic_cont {

	Static_Nonstatic_cont() {
		System.out.println("Hello i am constructor meet me first time");
	}

	static void add() {
		System.out.println("I am Addition");
	}

	static void substract() {
		System.out.println("I Am substract ");
	}

	void multiplication() {
		System.out.println("I am Mutiplication");
	}

	void division() {
		System.out.println("I am division");
	}

	public static void main(String[] args) {

		add();
		substract();

		Static_Nonstatic_cont S1 = new Static_Nonstatic_cont();
		S1.multiplication();
		S1.division();

	}

}
