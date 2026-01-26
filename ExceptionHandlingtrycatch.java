package first;
//TRY-CATCH EXAMPLE
public class ExceptionHandlingtrycatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =10;
			int b=0;
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException a) {
			System.out.println("cannot be divided by zero");
		}
System.out.println("Program continue...");
	}

}
