package Phase1.coreJava.inheritance;


interface Drawable{  
	int salary = 100;
	void draw();  //by default abstarct method()
	// public abstract void draw();	
	void show();
}  

interface Shape{
	int salary = 200;
	// public static final int salary = 100;
	
	void shape();  //by default abstarct method()
	// public abstract void shape();
	void show();
}

interface Demo extends Shape{	
}

public class interfaceExample implements Shape, Drawable{
	
	public void show(){
		System.out.println("inside show()");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("inside draw");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("inside shape");	
	}
	
	public static void main(String args[]){
		interfaceExample obj = new interfaceExample();
		obj.shape();
		obj.show();
		obj.draw();
		
		Drawable d = new interfaceExample();//Parent/interface reference var and child obj
		System.out.println("Sal of drawable: " +d.salary);// salary of i/f drawable
		Shape sh = new interfaceExample();
		System.out.println("Sal of shape; "+sh.salary);
	}
}