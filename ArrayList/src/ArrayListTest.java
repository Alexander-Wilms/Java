import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("rabbit");
		myArrayList.add("alligator");
		myArrayList.add("horse");

		System.out.println("ArrayList: " + myArrayList);
		System.out.println("size of array list: " + myArrayList.size());
		
		System.out.println("remove the element with index 1 from the ArrayList");
		myArrayList.remove(1);
		System.out.println("ArrayList: " + myArrayList);
		
		System.out.println("Insert new element at index 1, move existing elements farther back");
		myArrayList.add(1,"bear");
		System.out.println("ArrayList: " + myArrayList);

		ArrayList<String> myArrayList2 = new ArrayList<String>();
		myArrayList2.add("duck");
		myArrayList2.add("eagle");
		myArrayList2.add("shark");
		System.out.println("ArrayList2: " + myArrayList2);
		
		System.out.println("Add all elements of one ArrayList to another");
		myArrayList.addAll(myArrayList2);
		System.out.println("ArrayList: " + myArrayList);
		
		System.out.println("size of array list: " + myArrayList.size());

		System.out.println("Does myArrayList contain the element \"eagle\"?: " + myArrayList.contains("eagle"));
		
		System.out.println("Remove the element \"eagle\"");
		myArrayList.remove("eagle");
		
		System.out.println("Does myArrayList still contain the element \"eagle\"?: " + myArrayList.contains("eagle"));
		
		System.out.println("Element in myArrayList with index 1: " + myArrayList.get(1));
		
		myArrayList.add("horse");
		
		System.out.println("Index von \"horse\": " + myArrayList.indexOf("horse"));
		
		System.out.println("Letzter Index von \"horse\": " + myArrayList.lastIndexOf("horse"));
		
		System.out.println("ArrayList mit Iterator durchlaufen: ");
		
		Iterator<String> iter = myArrayList.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

} 