package first;
//STATIC KEYWORD EXAMPLE
class student {
	int rollNo;
	String name;
	static String college ="IIT Delhi";
	student(int r, String n)
	{
		rollNo =r;
		name = n;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+ college)	;
		}
}
public class StaticKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(1,"Yuvi");
		student s2 = new student(2,"Dev");
		
		s1.display();
		s2.display();

	}

}
