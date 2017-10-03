import java.util.*;
public class ArrayListTest {
	public static void main(String args[]) {
		
		/**
		 * Use of a List and ArrayList datatype. When datatype is known, use the 
		 * given datatype in < and >, otherwise ignore. NOTE however, that the list 
		 * can't be printed as strings unless the list itself is defined to be a 
		 * list of strings.
		 */
		
		List<String> list = new ArrayList<String>();	
		list.add("Rob");
		list.add("Kirsten");
		list.add("Tommy");
		list.add("Ralphie");
		
		/**
		 * 	For each loop below.
		 */
		
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
