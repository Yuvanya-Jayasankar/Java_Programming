package collections;
import java.util.HashSet;
import java.util.Set;
 //method 2 of the use case from day 9 23/01/26 using hashCode() and equals()
public class SetUC23M2
{
	
	private int patientId;
	private String name;
	private int age;
	static Set<SetUC23M2> patients=new HashSet<>();
 
	public SetUC23M2( int patientId,String name, int age)
	{
		this.patientId=patientId;
   	    this.name=name;
		this.age=age;
	}

public static void registerPatient(SetUC23M2 patient)
{
	if(patients.contains(patient))
	{
		System.out.println("Patient ID "+ patient.patientId + " is already registered");

	}else {
		System.out.println("Adding Patient");
		patients.add(patient);
		System.out.println("Patient added to the system: " + patient);
	}
}
public static void displayPatient() {
	System.out.println("List of unique Registration patients: ");
	for(SetUC23M2 p: patients) {
		System.out.println(p);
	}
}

public boolean equals(Object obj) {
	if(this == obj) {
		return true;
	}
	 if (obj == null || getClass() != obj.getClass())
         return false;

     SetUC23M2 patient = (SetUC23M2) obj;
     return this.patientId == patient.patientId;
	
}
public int hashCode() {
	return Integer.hashCode(patientId);
}
public String toString() {
	return "Patient [ID= " + patientId+ " Name= "+ name + " Age= "+ age+"]";
}
public static void main(String[] args) 

{
 SetUC23M2 p1 = new SetUC23M2(1,"Ram",22);
 SetUC23M2 p2 = new SetUC23M2(2,"Raj",23);
 SetUC23M2 p3 = new SetUC23M2(2,"Rose",24);
 
 registerPatient(p1);
 registerPatient(p2);
 registerPatient(p3); 

 displayPatient();
 
}

}
 
