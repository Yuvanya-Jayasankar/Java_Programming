package first;
//USE CASE(1) 20/01/26
public class P1usecase200126 {
	private int salary;
	void setSalary(int sal) {
		salary=sal;
	}
	int getSalary() {
		return salary;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1usecase200126 obj = new P1usecase200126();
		obj.setSalary(60000);
		System.out.println(obj.getSalary());
		
 
	}
 
}
 