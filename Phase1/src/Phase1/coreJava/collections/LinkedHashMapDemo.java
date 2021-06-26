package Phase1.coreJava.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer, String> linkedHashMap = new LinkedHashMap();
 
 linkedHashMap.put(1, new String("Samsung"));
 linkedHashMap.put(2, new String("Mi"));
 linkedHashMap.put(3, new String("Toshiba"));
 linkedHashMap.put(4, new String("HCL"));
 linkedHashMap.put(5, new String("Wipro"));
 
 System.out.println("Contents of LinkedHashMap: " + linkedHashMap);
 System.out.println("\nValue of map after iterating over it: ");
 
 for(Integer key : linkedHashMap.keySet()) {
	 System.out.println(key+ ":\t" + linkedHashMap.get(key));
 }
 System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());
 System.out.println("is empty " + linkedHashMap.isEmpty()); 
 System.out.println("Contains 2 as key? " + linkedHashMap.containsKey(2));
 System.out.println("contains HCL value " + linkedHashMap.containsKey("HCL")); 
 System.out.println("Remove entry for key3: " + linkedHashMap.remove(3));
 System.out.println("\nContents of LinkedHashMap after removing key 3: "+ linkedHashMap);
 
 linkedHashMap.clear();
 System.out.println("contents of listHashMap : " + linkedHashMap);
 
	}

}
