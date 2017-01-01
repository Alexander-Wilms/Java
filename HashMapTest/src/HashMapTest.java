import java.util.HashMap;
import java.util.Collection;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> MyHashMap = new HashMap<Integer, String>();
		
		System.out.println("HashMap.isEmpty: " + MyHashMap.isEmpty());
		
		MyHashMap.put(4711, "horse");
		MyHashMap.put(37, "shark");
		MyHashMap.put(666, "eagle");
		
		System.out.println("HashMap.isEmpty: " + MyHashMap.isEmpty());
		
		System.out.println(MyHashMap);
		
		MyHashMap.put(37, "rabbit");
		
		System.out.println(MyHashMap);
		
		Collection<String> MyCollection = MyHashMap.values();
		
		MyHashMap.put(42, "rabbit");
		
		System.out.println(MyCollection);
		
		MyHashMap.put(64, "bat");
		
		System.out.println(MyCollection);
	}
}
