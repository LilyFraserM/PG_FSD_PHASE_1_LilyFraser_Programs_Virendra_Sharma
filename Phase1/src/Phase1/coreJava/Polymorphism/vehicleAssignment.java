package Phase1.coreJava.Polymorphism;


class vehicle {
	 int speed; 
	 long distance;
//	public String nos_of_tyre; 
	 
	 vehicle(){
		 System.out.println("Inside vehicle constructor");
	 }
	 vehicle(int speed, long distance){
		 this.speed = speed;
		 this.distance = distance;
		 System.out.println("Inside vehicle param constructor" + " speed= " + speed + " dist= " + distance );
	 }
	
	void run() {
		System.out.println("Inside vehicle run");
	}
	void stop() {
		System.out.println("Inside vehicle stop");
	}
	 public void fuel(int capacity) {

			System.out.println("Inside vehicle fuel int = " + capacity); 
	 }
	 public void fuel(float capacity,String type) {

			System.out.println("Inside vehicle fuel with float = " +capacity +" and string = "+type); 
	 }
	 public void fuel(int capacity,char c) {

			System.out.println("Inside vehicle fuel with int = "+capacity +" and char= "+c); 
	 }
}


 
 class TwoWheeler extends vehicle {
	
	 int nos_of_tyre=2 ;
	 
	 TwoWheeler(int speed, long distance){
		 super(20, 12);
		 super.fuel(20);
		// this.speed = speed;
		// this.distance=distance;
		// this.nos_of_tyre=nos_of_tyre;
	 }
	 
	 void run() {
			System.out.println("Inside TwoWheeler run");
		}
		void stop() {
			System.out.println("Inside TwoWheeler stop");
		}
		void display() {
			
			TwoWheeler v = new TwoWheeler(speed, distance);
			System.out.println("twoWheeler values" + " speed= "+speed + " dist= " + distance + " no of tires= " + nos_of_tyre);
		}
	
}
 
class ThreeWheeler extends vehicle {
 int nos_of_tyre =3;
	 
 	ThreeWheeler(int speed, long distance){
 		super(speed,distance);
 		super.fuel(30f,"diesel");
 		
	 }
	 
	 void run() {
			System.out.println("Inside ThreeWheeler run");
		}
		void stop() {
			System.out.println("Inside ThreeWheeler stop");
		}
		void display() {
			
			//ThreeWheeler v = new ThreeWheeler(speed, distance);
			System.out.println("ThreeWheeler values" + " speed= "+speed + " dist= " + distance + " no of tires= " + nos_of_tyre);
		}
}


class FourWheeler extends vehicle {
	 int nos_of_tyre=4 ;
	 
	 FourWheeler(int speed, long distance){
		 super(speed,distance);
		 super.fuel(40,'c');
		 }
		 
		 void run() {
				System.out.println("Inside FourWheeler run");
			}
			void stop() {
				System.out.println("Inside FourWheeler stop");
			}
			void display() {
				
				//FourWheeler v = new FourWheeler(speed, distance);
				System.out.println("FourWheeler values" + " speed= "+speed + " dist= " + distance + " no of tires= " + nos_of_tyre);
			}
}
class EightWheeler extends vehicle {
	 int nos_of_tyre=8 ;
	 
	 EightWheeler(int speed, long distance){
		 super(speed,distance);
		 super.fuel(80,'d');
		 }
		 
		 void run() {
				System.out.println("Inside EightWheeler run");
			}
			void stop() {
				System.out.println("Inside EightWheeler stop");
			}
			void display() {
			
				System.out.println("EightWheeler values" + " speed= "+speed + " dist= " + distance + " no of tires= " + nos_of_tyre);
			}
}


public class vehicleAssignment {
	public static void main(String args[]) {
	
	
		vehicle vh; // parent class reference

	    vh = new TwoWheeler(20, 12); 
		vh.run();
		vh.stop();
		((TwoWheeler)vh).display();
		
		vh = new ThreeWheeler(30, 15);
		vh.run();
		vh.stop();
		((ThreeWheeler)vh).display();
		
		vh = new FourWheeler(40, 400); 
		vh.run();
		vh.stop();
		((FourWheeler)vh).display();
		
		vh = new EightWheeler(80, 1800); 
		vh.run();
		vh.stop();
		((EightWheeler)vh).display();
		
		
		 
	}
}