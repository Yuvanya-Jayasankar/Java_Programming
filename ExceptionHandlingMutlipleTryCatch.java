package first;
//MULTIPLE TRY-CATCH EXAMPLE
/*Tip:
 * Only one exception occurs at a time
Once an exception happens → remaining lines in try are skipped
Even though multiple catch blocks are written, only one exception occurs
at a time, and once it occurs, the remaining lines in the try block are
skipped and only the matching catch block is executed.
*/
public class ExceptionHandlingMutlipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {10,20,30};
			System.out.println(arr[5]);
	
			int a=10;
			int b=0;
			int result= a/b;
			System.out.println(result);
		}
		 catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of");
		}
		catch(Exception e) {
			System.out.println("Genreic Exception");
		}
	System.out.println("Program continue...");
	}

	}

