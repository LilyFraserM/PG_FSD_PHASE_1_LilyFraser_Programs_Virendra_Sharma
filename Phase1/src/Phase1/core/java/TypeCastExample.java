package Phase1.core.java;

public class TypeCastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=100;
		long l = 70000000;
		System.out.println("long val :" + l);
		
		int o = (int)l;
		System.out.println("int val :" + o);
		
		char t = (char)i;
		System.out.println("char val :" + t);
		
		//typecast btw double and float
		
		double d = 192345667.0067895;
		float r =(float)d;
		System.out.println("float val: " + r);
		System.out.println("double val: " + d);
		
		//typecast double->long->int
		
		double d2= 1000003454543.33454;
		long l2=(long)d2;
		int i2 = (int)l2;
		System.out.println("double val: " + d2);
		System.out.println("long val: " + l2);
		System.out.println("int val: " + i2);
		
		//long->float
		float f= l;
		System.out.println("float f val: " + f);
		
		//byte-> int->double
		byte b;
		int ii= 257;
		double dd=323.142;
		
		
		b= (byte)ii;
		System.out.println("conversion int to byte: " + b);
		
		
		
		b = (byte)dd;
		System.out.println("double to byte " + b);
		//System.out.println("double va " + b);
	  //  b = (byte) dd;
	    System.out.println("dd = "+dd +" b= " + b);
	    
	    
	    
	    }
	
	

	

}
