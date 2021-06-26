package Phase1.coreJava.excptinHandling;

import java.util.Scanner;

public class customExcptn {
	static void validate(int salary)throws SalaryException{
		if(salary<2000)
			throw new SalaryException("you need to work hard");
		else if (salary>2000 && salary<5000)
			throw new SalaryException("you salary is somehow good");
		else if (salary>5100  && salary<9000 )
			System.out.println("you salary is very good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("add salary:");
		int sal = sc.nextInt();
		try {
			validate(sal);
		}catch(Exception e) {
			System.out.println("exception occured " + e.getMessage());
		}
		System.err.println("rest of code...");

	}

}
class SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	}
}
