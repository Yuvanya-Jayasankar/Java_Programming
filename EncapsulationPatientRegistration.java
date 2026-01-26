package first;
//ENCAPSULATION
class PatientDetails{
	private int Id;
	private String name;
	private int age;
	private String illness;
	
	public void setId(int id) {
		this.Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	public int getId() {
		return Id;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getillness() {
		return illness;
	}
	
}

public class EncapsulationPatientRegistration {

	public static void main(String[] args) {
		PatientDetails p = new PatientDetails();
		p.setId(01);
		p.setName("Ram");
		p.setAge(21);
		p.setIllness("Fever");
		
		System.out.println(p.getId());
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getillness());
		

	}

}
