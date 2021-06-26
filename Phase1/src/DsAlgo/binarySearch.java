package DsAlgo;

public class binarySearch {
	public static int search(int [] arr, int val) {
		int start = 0;
		int end = arr.length -1;
		int mid = start +(end-start)/2;
		while(start<= end) {
		if(arr[mid] == val) {
			System.out.println("val found at pos : "+ mid);
			break;
		}
		else if(arr[mid]> val) {
			end = mid -1;
			
			
		}
		 if(arr[mid]< val) {
			 start = mid+1;
		 }
		 mid = start + (end-start)/2;
		}
    return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,5,8,12,16,23,38,56,72,91};
		int val = 23;
		search( arr, val);



	}

}
