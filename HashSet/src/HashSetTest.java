import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("rabbit");
		set.add("shark");
		set.add("horse");
		
		Iterator<String> iter = set.iterator();

		String tmp;
		
		System.out.println("Erster Durchlauf:");
		
		while(iter.hasNext()) {
			tmp = iter.next();
			System.out.println(tmp);
			if(tmp == "horse") {
				iter.remove();
			}
		}
		
		Iterator<String> iter2 = set.iterator();
		
		System.out.println("Zweiter Durchlauf:");
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		// Duplikat wird nicht hinzugefügt
		set.add("rabbit");
		
		Iterator<String> iter3 = set.iterator();
		
		System.out.println("Dritter Durchlauf:");
		
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
		}
	}

}
