package Phase1.coreJava.inheritance;


abstract class AbstractDemo {
	
	String name = "abc";
	
	AbstractDemo(){
		System.out.println("inside the abstract class..");
	}
	
	public void myMethod() {
		System.out.println("Hello");
	}

	abstract public void anotherMethod();

}


public class BasicAbstractionExmpl extends AbstractDemo {

	BasicAbstractionExmpl() {
		System.out.println(" Inside child class...");
	}

	public void anotherMethod() {
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		
		// AbstractDemo abs = new AbstractDemo(); //cant make obj of parent abstract class

		
		
		AbstractDemo obj = new BasicAbstractionExmpl();//object can only be made from parent refference variable to child class
		
		obj.anotherMethod();
		obj.myMethod();
	}

}

