package Phase1.core.java;



	public class TestA {
		private int y = 10;//private var
		long k = 1000;//default var
		
		public void methodPublic() {
			methodPrivate();
		}
		
		protected void methodProtected() {
			methodPrivate();
			
		}
		void methodDefault() {
			methodPrivate();
			
		}
		 private void methodPrivate() {
			 System.out.println("Class Test A: methodPrivate");
			 System.out.println("Value of private val y " +y);
			 System.out.println("Value of long "+k);
		 }

	}



