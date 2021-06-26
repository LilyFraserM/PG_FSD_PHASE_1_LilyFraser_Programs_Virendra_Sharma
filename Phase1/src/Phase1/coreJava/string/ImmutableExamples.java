package Phase1.coreJava.string;

public class ImmutableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Sachin;";
	//	String p = "Sachin";
		
		String t= "Delhi";
		String o = "Mumbai";
		String k = "Delhi";
		
		String y = new String ("Mumbai");
		String l = new String ("delhi");
		String p = new String ("Hello");
	//	String y = new String ("Mumbai");
	/*	(1) o with l
		(2) y with p
		(3) t with o
		(4) k with y
		(5) p with y*/
		
		if(o.equals(l)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		if(y.equals(p)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		if(t.equals(o)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}	
		
		if(k.equals(y)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}	
		if(p.equals(y)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}	
		
	}

}
