package Phase1.coreJava.inheritance;



class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
	}  
	  
class Aggregation{  
	 Operation op;//aggregation  // reference of the class created
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new Operation();  // object creation
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	  
	     
	    
public static void main(String args[]){  
 Aggregation c=new Aggregation(); 
 areaOfREct ar = new areaOfREct();
 double result=c.area(5);  
 double areaRect = ar.area(5);
 System.out.println("area of circle= " +result); 
 System.out.println("area of rect= " +areaRect);  
	 }  
	}  
 class areaOfREct {
	 Operation op;
	 int length;
	// where bredth = length;
	 double area(int length) {
		 op= new Operation();
		 double rectArea = op.square(length);
		return rectArea;
		 
	 }

}
