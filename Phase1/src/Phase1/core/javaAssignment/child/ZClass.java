package Phase1.core.javaAssignment.child;

import Phase1.core.javaAssignment.MClass;
import Phase1.core.javaAssignment.NClass;
import Phase1.core.javaAssignment.PClass;

public class ZClass  extends MClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Var of XClass----");
		System.out.println("long = " + new XClass().lx);
		System.out.println("protected = " + new XClass().flx);
		System.out.println("Public = " + new XClass().chx);
		
		System.out.println("----Methods of MClass----");
	//	new MClass().methodDefault();
		//new MClass().methodPrivate();
		new ZClass().methodProtected();
		new MClass().methodPublic();
		
		System.out.println("----Methods of PClass----");
		//new PClass().methodDefault();
		//new PClass().methodPrivate();
		//new PClass().methodProtected();
		new PClass().methodPublic();
		
		System.out.println("----Methods of NClass----");
		//new NClass().methodDefault();
		//new NClass().methodPrivate();
		//new NClass().methodProtected();
		new NClass().methodPublic();
	}

}
