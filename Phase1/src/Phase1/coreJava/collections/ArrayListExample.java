package Phase1.coreJava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("Hai");
		al.add("Hello");
		System.out.println("ArrayList is" + al);
		System.out.println("Size ArrayList is" + al.size());

		al.add(1, "How are you?");
		System.out.println("ArrayList is" + al);
		System.out.println("Class of ArrayList is" + al.getClass());
		System.out.println("Size ArrayList is" + al.size());
		System.out.println("ArrayList is" + al);

		al.remove(1);
		System.out.println("ArrayList is" + al);

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("India");
		a2.add("CoreJava");
		a2.add("Japan");
		a2.add("US");

		al.addAll(a2);

		System.out.println("ArrayList is" + al);
		System.out.println("ArrayList2 is" + a2);
		System.out.println("ArrayList @0 is" + al.get(0));
		System.out.println("ArrayList @1 is" + al.get(1));

		System.out.println("index of Japan is: " + al.indexOf("Japan"));

		al.set(3, "enjoy");
		System.out.println("ArrayList is" + al);

		al.remove("enjoy");
		System.out.println("ArrayList is" + al);

		al.remove(0);
		System.out.println("ArrayList is" + al);
		al.clear();
		System.out.println("ArrayList is" + al);

		/*
		 * Object[] arr = al.toArray();
		 * 
		 * System.out.println("Elements of ArrayList" + " as Array: " +
		 * Arrays.toString(arr));
		 */

		String[] arr = { "abc", "def", "ghi" };
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] a = { 1, 2, 3 };
		Arrays.sort(a, Collections.reverseOrder());
		Integer[] arrNew = { 30, 20, 40, 10 };

		/*
		 * Collections.sort  and Comparator both work in sorting the elements of a[] and arrNew in descending order.
		 */
		Arrays.sort(arrNew, Comparator.reverseOrder());

// Let us print the sorted array
		System.out.println("Array after the use of Collection.reverseOrder()" + " and Arrays.sort() :\n"
				+ Arrays.toString(arrNew));
		System.out.println("reverse sorted arr: " + Arrays.toString(a));

		List<String> list = Arrays.asList(arr);
		List<Integer> list1 = Arrays.asList(arr1);
		System.out.println("------ArrayList  from arr and vice-versa-----");
		System.out.println("ArrayList list from arr is" + list);
		System.out.println("ArrayList list1 from arr1 is" + list1);
		Object[] arr2 = list1.toArray();
		System.out.println("Array  from  ArrayList list1 is" + Arrays.toString(arr2));
	}

}
