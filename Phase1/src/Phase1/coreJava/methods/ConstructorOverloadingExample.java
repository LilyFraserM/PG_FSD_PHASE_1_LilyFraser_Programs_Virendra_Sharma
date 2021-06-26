package Phase1.coreJava.methods;

public class ConstructorOverloadingExample {
	int id;
	String name;
	public ConstructorOverloadingExample() {
		System.out.println("Inside");
	}
	public ConstructorOverloadingExample(int i,String n)
	{
		id=i;
		name= n;
		System.out.println("im inside default constructor");
	}
	
	public void display() {
		System.out.println(id +" name");
	}
	
	public static void main(String args[]) {
		ConstructorOverloadingExample s1 = new ConstructorOverloadingExample(111,"Karan");
		ConstructorOverloadingExample s2 = new ConstructorOverloadingExample(222,"Aryan");
				s1.display();
				s2.display();
	//			new ConstructorOverloadingExample.s2.display();
	}

}
