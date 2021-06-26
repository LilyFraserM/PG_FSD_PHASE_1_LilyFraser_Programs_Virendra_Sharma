package Phase1.coreJava.regularExpression;

import java.util.regex.Pattern;

public class ExampleReg_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
System.out.println(Pattern.matches("\\d{10}", "9123456780"));
//from Virendra to All Participants:
//password that shoud have - first letter caps  / 
//contain 3 digits / contains any number of alpahbets also 
System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "A123esfedDD"));
System.out.println(Pattern.matches("[A-Z]+\\d{3}\\D", "A123esfedDD"));
//maxlength =10 and letters in any order
System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "A123esfedDD"));
/*
 * (1) validate the given email id (that shoud have pattern with @ and .com    
    (a)  firstname@prolim.com
    (b)  viren@gmail.com
    (c)  test123prepare@co.edu.com
 */
	}

}
