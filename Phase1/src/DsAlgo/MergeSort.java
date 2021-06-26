package DsAlgo;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,3,5};
		   mergeSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}


	}

	private static void mergeSort(int[] arr) {
	
		/*int[]temp = new int[arr.length];
		int start = 0;
		int end = arr.length-1;*/
		mergeSort(arr, new int[arr.length],0,arr.length-1);
		
	}

	private static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {
			return;
		}
		int mid = leftStart + (rightEnd-leftStart)/2;//(rightEnd+leftStart)/2; to prevent overflow
		mergeSort(arr, temp,leftStart,mid);
		mergeSort(arr, temp,mid+1,rightEnd);
		mergeHalves(arr, temp,leftStart,rightEnd);
		
	}

	private static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = leftStart + (rightEnd-leftStart)/2;//(rightEnd+leftStart)/2;
		int rightStart = leftEnd+1;
		int size = rightEnd - leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {//while the array is in bounds
			 if(arr[left] <= arr[right]) {
				 temp[index] = arr[left];
				 left++;
			 }
			 else {
					 temp[index] = arr[right];
					 right++;
				 }
			 index++;
			 }
		System.arraycopy(arr, left, temp,index, leftEnd - left +1);
		System.arraycopy(arr, right, temp, index, rightEnd - right +1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
		}
		
	}


