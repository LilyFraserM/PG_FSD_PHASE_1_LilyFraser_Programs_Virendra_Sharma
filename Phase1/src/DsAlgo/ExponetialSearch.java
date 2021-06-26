package DsAlgo;

import java.util.Arrays;

public class ExponetialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,12,18,24,32};
		int length = arr.length;
		int value = 18;
		int outcome = exponetialSearch(arr,length,value);
		
		if(outcome<0) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element present @ index: " + outcome);
		}

	}
	
	public static int exponetialSearch(int[] arr, int length, int value) {
		if(arr[0] == value) {
			return 0;
		}
		int i=1;
		while(i<length && arr[i] <= value) {
			i =  i*2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i, length), value);
	}

}
