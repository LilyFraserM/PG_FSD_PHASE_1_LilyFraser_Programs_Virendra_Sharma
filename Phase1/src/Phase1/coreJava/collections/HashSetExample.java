package Phase1.coreJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hs = new TreeSet<>();
		hs.add("d");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("i");
		hs.add("l");
		
		TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
		reverseSet.add(21);
		reverseSet.add(32);
		reverseSet.add(44);
		reverseSet.add(11);
		reverseSet.add(54);
		System.out.println("TreeSet elements in descending order " + reverseSet);
		
		HashSet<Object> obj = new HashSet<>();
		obj.add("d");
		obj.add(6);
		obj.add(true);
		obj.add(12.2f);
		
		
	/*	TreeSet<Object> objTree = new TreeSet<>();
		objTree.add("d");
		objTree.add(61);
		objTree.add(true);
		objTree.add(12.2f);*/

		
		HashSet<String> tt = new HashSet<>();
		tt.add("Hello");
		System.out.println("Inserting Hello in the HashSet:  " + tt.add("Hello"));
		System.out.println("Inserting Hello in the HashSet:  " + tt.add("Hello"));
		tt.add("fgf");
		tt.add("kllk");
		tt.add("Hello");
		tt.add("bnnm");
		tt.add("er");
		tt.add("abc");
		
		LinkedHashSet<String> country = new LinkedHashSet<String>();
		country.add("India");
		country.add("Aus");
		country.add("England");
		country.add("USA");
		country.add("Srilanka");
		country.add("India");
		
		
		
		System.out.println("HashSet is: " + tt);
		System.out.println("HashSet without type is: " + obj);
		//System.out.println("TreeSet without type is: " + objTree);
		
		System.out.println("LinkedHashSet is: " + country);
		
		System.out.println("HashSet  size is: " + tt.size());
		System.out.println("HashSet contains Hellu?: " + tt.contains("Hellu"));
		System.out.println("HashSet contains Hello?: " + tt.contains("Hello"));
		System.out.println("LinkedHashSet removed srilanka " + country.remove("Srilanka") + country);
		
System.out.println("------------------------Iterators------------------------------");
		Iterator itr2 = tt.iterator();
		while(itr2.hasNext()) {
		System.out.println("print with iterator2 " + itr2.next());
		}
		System.out.println("******forEachRemaining******");
		Iterator newItr = tt.iterator();
		newItr.forEachRemaining(element -> System.out.println(element));
		
		System.out.println("*********forEach******");
		tt.forEach(System.out::println);
		System.out.println("------------------------------------------------------");
		System.out.println("---------------------Sorting Hashset---------------------");
		List<String> list = new ArrayList<>(tt);
		// Sorting the list.
		Collections.sort(list);
		System.out.println("sorted HashSet=: ");
		list.forEach(System.out::println);
		//or 
		System.out.println("sorted HashSet=: " + list);
		
		System.out.println(" is the HashSet empty? : " + tt.isEmpty());
		System.out.println("Does Hash set contain c? " + tt.contains("c"));
		
		
		System.out.println(" Empty HashSet : " + tt.removeAll(tt) +"\n HashSet now :"+ tt);
		
		
		System.out.println("HashSet  class is: " + tt.getClass());
		
		System.out.println(" ---------- Tree Set ----------- ");
		System.out.println("TreeSet is: " + hs);
		hs.addAll(country);
		System.out.println(" TreeSet after addition of LinkedHashSet : " + hs );
		
		System.out.println("fetch first element inTreeSet : " + hs.first());
		System.out.println("fetch last element inTreeSet : " + hs.last());
		System.out.println("poll first element inTreeSet : " + hs.pollFirst());
		System.out.println("fetch first element inTreeSet : " + hs.first());
		///hs.fet
		System.out.println("fetch  element higher than USA : " + hs.higher("USA"));
		System.out.println("fetch  headset of USA: " + hs.headSet("India"));
		System.out.println("fetch  tailset of India " + hs.tailSet("India"));
		System.out.println("fetch  subset of  " + hs.subSet("India", "i"));
		 hs.remove("c");
		System.out.println("TreeSet  after removal of c is: " + hs);
		System.out.println("Checking if TreeSet is empty: " + hs.isEmpty());
		System.out.println("Checking the TreeSet size: " + hs.size());
		System.out.println("Checking if TreeSet contains England: " + hs.contains("England"));

	}

}
