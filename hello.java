package first;
import java.util.Scanner;
public class hello {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String CityName = sc.nextLine();
		float Temperature = sc.nextFloat();
		boolean isHot = sc.nextBoolean();
		int threshold = sc.nextInt();
		
		if(Temperature > 30) {
			System.out.println("Hot day");
		}
		else {
			System.out.println("Normal Day");
		}
		
	}

}
