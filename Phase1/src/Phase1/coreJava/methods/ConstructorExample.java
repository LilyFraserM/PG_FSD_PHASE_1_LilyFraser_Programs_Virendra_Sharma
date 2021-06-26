package Phase1.coreJava.methods;

public class ConstructorExample {
	int id;
	String name;
	public ConstructorExample()
	{
		id=10;
		name= "hell0";
		System.out.println("im inside default constructor");
	}
	void display()
	{
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample s2 = new ConstructorExample();
		
		s2.display();

	}

}
