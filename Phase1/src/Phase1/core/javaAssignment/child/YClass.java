package Phase1.core.javaAssignment.child;

import Phase1.core.javaAssignment.MClass;
import Phase1.core.javaAssignment.NClass;

public class YClass extends NClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----variables of class x----");
		System.out.println("long= "+ new XClass().lx);
		System.out.println("float= "+ new XClass().flx);
		System.out.println("char= "+ new XClass().chx);
		
		System.out.println("----methods of class NClass----");
		//new NClass().methodPrivate();
		///new NClass().methodDefault();
		new YClass().methodProtected();
		new NClass().methodPublic();

		System.out.println("----methods of class MClass----");
		//new MClass().methodPrivate();
		//new MClass().methodProtected();
		//new MClass().methodDefault();
		new MClass().methodPublic();
		
	}

}
