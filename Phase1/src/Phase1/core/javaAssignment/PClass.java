package Phase1.core.javaAssignment;

public class PClass {
	
	public static void main(String[] args) {
		//MClass values
		System.out.println("MClass values");
		new MClass().methodPublic();
		new MClass().methodDefault();
		//new MClass().methodPrivate();
		new MClass().methodDefault();
		System.out.println("MClass variables are- long l:" + new MClass().l); 
		System.out.println("MClass variables are- double fl:" + new MClass().fl); 
		
		System.out.println("NClass values");
		
		new NClass().methodPublic();
		new NClass().methodDefault();
	//	new NClass().methodPrivate();
		new NClass().methodProtected();
		
		System.out.println("NClass variables are- long ln:" + new NClass().ln); 
		System.out.println("MClass variables are- double dn:" + new NClass().dn);
		System.out.println("MClass variables are- int in:" + new NClass().in);
	}
		
		public void methodPublic() {
			System.out.println("Class PClass: methodPublic");
		}
		protected void methodProtected() {
			System.out.println("Class PClass: methodProtected");
		}

		 void methodDefault() {
			System.out.println("Class PClass: methodDefault");
		}
		private void methodPrivate() {
			System.out.println("Class PClass: methodPrivate");
		}
		
	
	

}
