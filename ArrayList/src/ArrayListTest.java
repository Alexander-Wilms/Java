import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("rabbit");
		myArrayList.add("alligator");
		myArrayList.add("horse");

		System.out.println("ArrayList: " + myArrayList);
		System.out.println("size of array list:" + myArrayList.size());
		
		myArrayList.remove(1);
		
		myArrayList.add(1,"bear");

		ArrayList<String> myArrayList2 = new ArrayList<String>();
		myArrayList2.add("duck");
		myArrayList2.add("eagle");
		myArrayList2.add("shark");
		
		myArrayList.addAll(myArrayList2);
		
		System.out.println("ArrayList 2: " + myArrayList2);
		
		System.out.println("ArrayList 1: " + myArrayList);
		
		System.out.println("size of array list: " + myArrayList.size());

		System.out.println("Enthält \"eagle\": " + myArrayList.contains("eagle"));
		
		myArrayList.remove("eagle");
		
		System.out.println("Enthält \"eagle\": " + myArrayList.contains("eagle"));
		
		System.out.println("2. Element: " + myArrayList.get(1));
		
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