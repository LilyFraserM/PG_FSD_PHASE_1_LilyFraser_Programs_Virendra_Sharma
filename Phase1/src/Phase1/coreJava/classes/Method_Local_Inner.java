package Phase1.coreJava.classes;

class Outer{
	private int age=90;
	
	void dis() {
		System.out.println("Inside dis method");
	}
	
	void outerMethod() {
		System.out.println("inside outerMethod");
		
		class Inner{
			
		}
	}
}
public class Method_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
