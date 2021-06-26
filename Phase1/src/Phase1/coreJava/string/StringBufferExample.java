package Phase1.coreJava.string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Hello");
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(1,"Java");
		System.out.println(sb);
		

		sb.replace(1,3,  "Java");
		System.out.println(sb);

		sb.delete(1,3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		

		StringBuffer ss = new StringBuffer("Core");
		System.out.println(">>>>>" + ss);
		
		ss.append("Java");
		System.out.println(">>>>>" + ss);
		System.out.println(ss.length());
		System.out.println(ss.charAt(6));
		System.out.println(ss.reverse());
	}
	
	

}
