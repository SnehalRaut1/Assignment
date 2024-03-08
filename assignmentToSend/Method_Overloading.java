package assignmentToSend;
/*Assinment 18:Write a program with 4 Static method and 
 4 Non-Static method make sure all have same name*/

public class Method_Overloading {

	static void add() {
		System.out.println("Static method 1");
	}

	static void add(int a) {
		System.out.println("Static method 2");

	}

	static void add(char c) {
		System.out.println("Static method 3");

	}

	static void add(double d) {
		System.out.println("Static method 4");

	}

	void add(int a, int b) {
		System.out.println("non Static method 1");

	}

	void add(int a, char b) {
		System.out.println("nonStatic method 2");

	}

	void add(char b, int a) {
		System.out.println("Non-Static method 3");

	}

	void add(boolean a) {
		System.out.println("Non-Static method 4");

	}

	public static void main(String[] args) {

		add();
		add(10);
		add('a');
		add(3.14);

		Method_Overloading m1 = new Method_Overloading();

		m1.add(10, 200);
		m1.add(30, 'b');
		m1.add('n', 20);

		m1.add(true);

	}

}
