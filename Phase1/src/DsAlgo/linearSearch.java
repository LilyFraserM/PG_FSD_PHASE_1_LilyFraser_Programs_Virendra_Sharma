package DsAlgo;

public class linearSearch {
	public static int search(int []arr,int ele) {
		int result=-1;
		int i;
		for( i=0;i<arr.length-1;i++){
			if(arr[i]== ele)
				result = i;
		}
		return i ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int []arr= {5,13,90,10,12,11,2,15};
		int key = 12;
		System.out.println("search number 12 at index :" + search(arr,key));
	}

}
