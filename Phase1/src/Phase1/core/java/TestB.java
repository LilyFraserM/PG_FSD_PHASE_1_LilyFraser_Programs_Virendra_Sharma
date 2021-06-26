package Phase1.core.java;

public class TestB {
	public static void main(String args[]) {
		new TestA().methodPublic();
		new TestA().methodProtected();
		new TestA().methodDefault();
		System.out.println("Value of long"+ new TestA().k);
		
	}
	public void methodPublic() {
		System.out.println("Class TestB: methodPublic");
	}
	public void methodProtected() {
		System.out.println("Class TestB: methodProtected");
	}

	public void methodDefault() {
		System.out.println("Class TestB: methodDefault");
	}
	public void methodPrivate() {
		System.out.println("Class TestB: methodPrivate");
	}


}
