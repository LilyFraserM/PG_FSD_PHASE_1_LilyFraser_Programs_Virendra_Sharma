package Phase1.coreJava.basic;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{3,4}};
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				System.out.print(arr[i][j] +"");
			}
			 System.out.println(); 
		}

		
		int[][] a = {{7,4},{2,9}};
		int[][] b = {{1,5},{3,8}};
		int [][]ans = new int[2][2];
		
		 System.out.println("sum is "); 
		for(int i =0;i<a.length;i++) {
			for(int j=0;j< a[i].length;j++) {
				ans[i][j] = a[i][j]+b[i][j] ;
				
				System.out.print(ans[i][j] +" ");
			}
			 System.out.println(); 
		}
		
	}

}
