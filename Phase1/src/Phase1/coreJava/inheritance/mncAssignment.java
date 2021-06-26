package Phase1.coreJava.inheritance;



abstract class MNC {
	 MNC(){
		System.out.println("inside the abstract class MNC's constructor..");
	}
	
	void normalMethod() {  //non-abstract method
		
		System.out.println("normalMethod is created");
	}

	abstract void abstractExample1(); // abstract method()
	abstract void abstractExample2(); // abstract method()

	
}

abstract class Infosys extends MNC {
	
	abstract void abstractExample2();
	
	void abstractExample1(){
		System.out.println("abstractExample1 method implemented in Infosys");
	}
}

class Hello extends Infosys {
	void abstractExample1(){
		super.abstractExample1();//implements abstractExample1 from infosys class
		System.out.println("abstractExample1 method implemented in Hello");
	}
	@Override
	void abstractExample2() {
		System.out.println("abstractExample2 method implemented in Hello");
		// TODO Auto-generated method stub
		
	}
	void normalMethosOfHello() {
		System.out.println("normalMethosOfHello method implemented in Hello");
	}
	
}

public class mncAssignment {
	public static void main(String args[]) {

		
		Infosys k = new Hello(); // reference of parent(Honda abstract class) and
								// object of Child(Hello) class
		k.abstractExample1();
		k.abstractExample2();
		
		((Hello)k).normalMethosOfHello();//downcasting
			
	}
}