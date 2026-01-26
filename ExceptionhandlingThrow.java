package first;
//THROW EXAMPLE
public class ExceptionhandlingThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int bal= 100;
			if(bal<5000) {
				throw new Exception("Insufficient bal");
			}
			else {
				System.out.println("Sufficient bal");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
