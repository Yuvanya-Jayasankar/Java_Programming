package collections;
import java.util.*;
//use case from day 11 for map
public class MapUC280126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> Patient = new HashMap<>();
		
		Patient.put(101, "Hasini");
		Patient.put(102, "Sai");
		Patient.put(103, "Hari");
		Patient.put(104, "Hema");
		System.out.println("Patients added "+Patient);
		//update
		Patient.replace(101, "Raj");
		System.out.println("Replaced patient 1 "+Patient);
		//retrieve
		System.out.println("Retrieved the data "+ Patient.get(101));
		//remove
		Patient.remove(104);
		System.out.println("Removed 104 "+Patient);
		System.out.println(Patient);
		//check existence of a patient
		System.out.println("Check the existence of a patient Sai "+Patient.containsValue("Sai"));
		//count total patients
		System.out.println("Count of total patients "+ Patient.size());
		//clear the system
		Patient.clear();
		System.out.println("Cleared "+Patient);
	}
}
