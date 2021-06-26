package DsAlgo;

public class InsertionSort {
	
	static void insertionSort(int[] arr) {
		  int ele, j;
		  //Traverse through 1 to size of the array
		  for (int i = 1; i < arr.length; i++) {
		   ele = arr[i]; // Element to be inserted
		   j = i - 1;

		   //shifts elements back to create space for the element to be inserted
		   while (j >= 0 && arr[j] > ele) {
		    arr[j + 1] = arr[j];
		    j = j - 1;
		   }
		   arr[j + 1] = ele;
		  }
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {5,4,1,0,5,95,4,-100,200,0};
		  insertionSort(arr);
		  for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
	}

}
