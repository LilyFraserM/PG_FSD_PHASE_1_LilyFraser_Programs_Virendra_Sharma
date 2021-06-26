package Phase1.coreJava.excptinHandling;

import java.util.Scanner;

public class ThrowClause {
	static int add(int num1,int num2) {
		if(num1>900) {
			throw new ArithmeticException("Num1 >900 ans hence exception");
		}else 
		{
			System.out.println("both param are correct");
		}
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("add number 1:");
		 int num1 = sc.nextInt();
		 System.out.println("add number 2:");
		 int num2 = sc.nextInt();
		 
		 try {
			 result = add(num1, num2);
		 }catch(ArithmeticException ae) {
			 System.out.println(ae.getMessage());
		 }
		 System.out.println("result=" + result);
		


	}

}
