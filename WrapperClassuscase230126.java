package first;
//USECASE 2 FROM DAY 8 (WRAPPER CLASSS)
import java.util.*;
public class WrapperClassuscase230126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Age: ");
		Integer Age = sc.nextInt();
		System.out.println("CIBIL Score: ");
		Integer CibilScore = sc.nextInt();
		System.out.println("Monthly Income: ");
		ArrayList<Double> MonthlyIncome = new ArrayList();
		MonthlyIncome.add(sc.nextDouble());
		
		System.out.println(" ");
		for(Double monthlyincome: MonthlyIncome) {     
			if(Age >= 25 && CibilScore >= 750 && monthlyincome >= 50000) {
				System.out.println("Eligible for the loan");
			}
			else {
				System.out.println("Not Eligible for the loan");
			}
		}
	

	}

}
