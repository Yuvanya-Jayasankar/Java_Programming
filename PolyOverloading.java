package first;
//method overloading
class Poly{
	String name;
	int age;
	
	public void display(String name) {
		System.out.println(name);
	}
	public void display(int age) {
		System.out.println(age);
	}
}


public class PolyOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p1= new Poly();
		p1.display(24);
		p1.display("Rushikesh");
	}

}
