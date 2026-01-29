package collections;
import java.util.Set;
import java.util.TreeSet;
public class SetExTreeSet{
	public static void main(String[] args) {
		
		Set<String> cities = new TreeSet<>();
		cities.add("Delhi");
		cities.add("Bengaluru");
		cities.add("Chennai");
		cities.add("Bengaluru");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add(null);
		System.out.println(cities);
	}

}
