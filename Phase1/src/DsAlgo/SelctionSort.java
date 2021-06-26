package DsAlgo;

public class SelctionSort {
	
	
	public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  


		 public static void main(String args[]) {
		  int arr[] = {9,6,3,1,2,4,5};
		//  int arrSize = 10;
		  selectionSort(arr);
		  for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		 }

	
}
