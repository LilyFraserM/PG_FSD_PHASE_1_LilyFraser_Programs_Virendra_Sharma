package Phase1.coreJava.excptinHandling;

public class xceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		num1=20;
		num2=0;
		
		try {
			int a[] = new int[5];
			a[5]=9;
			a[4]=30/0;
			num3=num1/num2;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic Exception occurs");
			
		}
		catch(Exception e) {
			System.out.println("Arithmetic Exception occurs");
			
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("rest of code");
	}

}
