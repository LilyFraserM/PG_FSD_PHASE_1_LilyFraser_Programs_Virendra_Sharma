package Phase1.coreJava.classes;



class Demo{
	void show() {
		System.out.println("im in show method of suoer class");
	}
}

public class Anonymus_Inner {


		// TODO Auto-generated method stub
		static Demo d = new Demo() {
			void show() { 
		           super.show(); 
		           System.out.println("i am in Flavor1Demo class"); 
		       } 
		   }; 	
		   public static void main(String[] args){ 
		       d.show(); 
		   } 
	

}
