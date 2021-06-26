package DsAlgo;

public class QuickSort {
	  static void quickSort(int array[], int low, int high) {
	    if (low < high) {

	      // find pivot element such that
	      // elements smaller than pivot are on the left
	      // elements greater than pivot are on the right
	      int pi = partition(array, low, high);
	      
	      // recursive call on the left of pivot
	      quickSort(array, low, pi - 1);

	      // recursive call on the right of pivot
	      quickSort(array, pi + 1, high);
	    }
	  }
	
	 static int partition(int array[], int low, int high) {
		    
		    // choose the rightmost element as pivot
		    int pivot = array[high];
		    
		    // pointer for greater element
		    int i = (low - 1);

		    // traverse through all elements
		    // compare each element with pivot
		    for (int j = low; j < high; j++) {
		      if (array[j] <= pivot) {

		        // if element smaller than pivot is found
		        // swap it with the greater element pointed by i
		        i++;

		        // swapping element at i with element at j
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }

		    }

		    // swapt the pivot element with the greater element specified by i
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;

		    // return the position from where partition is done
		    return (i + 1);
		  }

		

	public static void main(String[] args) {
		//Always choose pivot at one end  or the other not in the middle
		int[] arr = {10,7,8,9,1,5,90,45,88,55,11,43,23,4,2,99};
		   quickSort(arr, 0, arr.length - 1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
