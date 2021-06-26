package Phase1.core.java.child;

import Phase1.core.java.TestB;

public class TestC {

	void defaultMethod() {
		System.out.println("Inside the Default method of class TestC");
		
	}
	
	public static void main(String[] args) {
		new TestB().methodPublic();
	}
}
