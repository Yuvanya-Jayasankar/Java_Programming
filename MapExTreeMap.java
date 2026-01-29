package collections;
import java.util.Map;
import java.util.TreeMap;
public class MapExTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> Student = new TreeMap<>();
		 
		Student.put(1, "Reshma");
		Student.put(2, "Harshith");
		Student.put(3, "Jo");
		Student.put(4, "Sam");
		Student.put(5, "Hema");
		
		System.out.println(Student);
		//DIFFERENT METHODS
		System.out.println("1"+Student.containsKey(1));
		System.out.println("2"+Student.get("Jo"));
		System.out.println("3"+Student.getOrDefault(2, null));
		System.out.println("4"+Student.remove(4));
		System.out.println("5"+Student.replace(5, "Malini"));

	}

}
