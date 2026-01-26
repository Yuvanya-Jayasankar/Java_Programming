package first;
//INTERFACE WITH DEFAULT METHOD EXAMPLE

interface vehicle
{
	void start();
	
	default void fuelType()
	{
		System.out.println("Fueled");
	}
	
}
class carss implements vehicle{
	public void start()
	{
		System.out.println();
	}
}
 
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v=new carss();
		v.start();
		v.fuelType();
		

	}

}
