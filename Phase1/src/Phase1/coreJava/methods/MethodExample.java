package Phase1.coreJava.methods;

public class MethodExample {
int h=9;
public static void main(String args[]) {
	int a=11;
	int b=6;
	int x = 5;
	int y= 2;
	int r= 5;
	int i=5;
	int j=2;
	int c=minFunction(a,b);
	int s= add(x,y);
	float ar = area(r);
	int areaOfRect = areaRect(i,j);
	System.out.println("Sum val = :" +s);
	System.out.println("Min val = :" +c);
	System.out.println("area val = :" +ar);
	System.out.println("area rect = :" +areaOfRect);
}

public static int minFunction(int n1,int n2) {
	int min;
	if(n1>n2)
		min = n2;
	else
		min = n1;
	
	return min;
}

public static int add(int x, int y) {
	int sum = x+y;
	return sum;
	
}

public static float area(float radius) {
	float pie= 3.14f;
	float area = pie* radius*radius;
	return area;
	
}
public static int areaRect(int i, int j) {
	int area = i*j;
	return area;
	
}
	
}
