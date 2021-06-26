package Phase1.coreJava.collections;

import java.util.Arrays;

class SumOfThree{
	  public static int[] findSumOfThree(int arr[], int requiredSum) {
		  int[] result = new int[3];
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length-2; i++) {
	      for (int j = i+1; j < arr.length-1; j++) {
	        // Looking for requiredSum = arr[i]+arr[j]+arr[k]
	        int remainingSum = requiredSum -( arr[i] + arr[j]);
	        int k = Arrays.binarySearch(arr, remainingSum);
	        if (k > 0 && k != i && k != j) {
	        	result[0]=arr[i];
	        	result[1]=arr[j];
	        	result[2] = arr[k];
	         /*result.add(arr[i]);
	         result.add(arr[i]);
	         result.add(arr[i]);*/
	        }
	      }
	    }
	    return result;
	  }

	  public static void main(String []args){
	    int[] arr = {3, 7, 1, 2, 8, 4, 5};
	    System.out.println("Original Array: " + Arrays.toString(arr));                                         
	    System.out.println("Sum 20 exists " + Arrays.toString(findSumOfThree(arr, 20))); 
	    System.out.println("Sum 10 exists " + Arrays.toString(findSumOfThree(arr, 10)));
	    System.out.println("Sum 21 exists " + Arrays.toString(findSumOfThree(arr, 21)));
	  }  
	}  