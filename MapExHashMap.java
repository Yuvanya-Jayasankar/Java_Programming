package collections;
import java.util.HashMap;
import java.util.Map;
//HASHMAP EXAMPLE
public class MapExHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>Employee = new HashMap<>();
		
		Employee.put(101,"Ramu");
		Employee.put(102,"Somu");
		Employee.put(103,"Akhil");
		Employee.put(null,"Raju");
		Employee.put(105,"Hari");
		
		System.out.println(Employee);
		//DIFFRENT METHODS
		System.out.println("1 " +Employee.clone());
		System.out.println("2 " +Employee.get(104));
		System.out.println("3 " +Employee.hashCode());
		System.out.println("4 " +Employee.putIfAbsent(105,"Hari"));
		System.out.println(Employee);
		System.out.println("5 " +Employee.remove(105));
		System.out.println(Employee);
		System.out.println("6 " +Employee.replace(null, "Chutki"));
		System.out.println(Employee);
		System.out.println("7 " +Employee.size());
		System.out.println("8 " +Employee.containsKey(101));
		System.out.println("9 " +Employee.containsValue("Somu"));
		System.out.println("10 " +Employee.equals(Employee));
		System.out.println("11 " +Employee.isEmpty());
		System.out.println("12 " +Employee.values());
		Employee.clear();
		System.out.println("13 " + Employee);
		

	}

}
