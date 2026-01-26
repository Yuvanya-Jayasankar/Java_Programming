package first;
//INTERFACE WITH STATIC METHOD EXAMPLE
interface calculator{
	static void add (int a, int b)
	{
		System.out.println(a+b);
	}
}
public class InterfaceTest2 {
 
	public static void main(String[] args)
	{
calculator.add(10, 20);
	}
 
}

