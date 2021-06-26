package Phase1.coreJava.classes;

import Phase1.coreJava.classes.Member_Inner.Inner;

public class Member_Inner {
	private int data=30;
	
	void display() {
		System.out.println("Im in side the outer class");
	}
	class Inner{
		private int data=20;
		
		void msg() {
			System.out.println("data is " + data);
		}
		
		void display() {
			System.out.println("Im inside inner class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_Inner obj = new Member_Inner();
       Inner in = obj.new Inner();
       in.msg();
       in.display();
	}

	
}
