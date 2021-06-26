package Phase1.coreJava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			//{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 int indx = Arrays.binarySearch(numbers, 4);
		 System.out.println("index is at pos- " + indx);
		 
		 System.out.println("searching index of 8 is btw pos 6 and 9 pos: " + Arrays.binarySearch(numbers,6,9, 8 ));
		
		Integer[] nums = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
		 Arrays.sort(nums);
		 System.out.println("sorted array");
		 for(int i :nums)
			 System.out.print(i + " ");

		 
		 Integer[] numsToSort = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
		 System.out.println("\n using parallel sort");
		 Arrays.parallelSort(numsToSort);
		 for(int i: numsToSort)
			 System.out.print(i + " ");
		 
		 System.out.println("\n copy arrays");
		 int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			int[] newArr = Arrays.copyOf(arr, arr.length);
			System.out.println("The copied array is: ");
			for(int i : newArr)
				System.out.print(i + " ");
			
			int[] newArr1 = Arrays.copyOf(arr, 15);
			System.out.println("\n The copied larger array is: ");
			for(int i : newArr1)
				System.out.print(i + " ");
			
			int[] arrRange = Arrays.copyOfRange(arr, 2, 6);
			System.out.println("\n The copied  array  between range 2 and 6 is: ");
			for(int i : arrRange)
				System.out.print(i +  " ");
			
			System.out.println("\n convert Arrays to list case of int[]");
			
			int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			//List<Integer> list = Arrays.asList(arr1);
			// List<Integer> list = Ints.asList(arr);
			List<int[]> list = Arrays.asList(arr1);
			System.out.println(Arrays.toString(list.get(0)));
			
			List<Integer>list1 = Arrays.stream(arr)        // IntStream
											.boxed()          // Stream<Integer>
											.collect(Collectors.toList());

System.out.println("Arrays to list" +list1);
			

System.out.println("\n convert Arrays to list in case of Integer[]  " );
Integer[] example = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

List<Integer> listExample = Arrays.asList(example);
System.out.print(listExample);

boolean isEqual = Arrays.equals(nums, example);
System.out.print("\nChecking if two arrays are equal : " + isEqual);

System.out.println("\ncopy one list into another");
List<Integer> lst1 = new ArrayList<>();
lst1.add(9);
lst1.add(12);
lst1.add(34);
lst1.add(54);
lst1.add(66);
lst1.add(76);

List<Integer> list2 = new ArrayList<>();
list2.add(90);
list2.add(12);
list2.add(98);
list2.add(43);

Collections.copy(lst1, list2);

System.out.println("coppied list" +lst1);
	}
	
	
	

}
