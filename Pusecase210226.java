package first;
//USE CASE - 1 FROM DAY 7 ATM SCENARIO
import java.util.*;
class AtmScenario{
	private int pin;
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return pin;
	}
	
}
public class Pusecase210226 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AtmScenario a = new AtmScenario();
		a.setPin(123456);
		try {
			
			System.out.println("Enter PIN: ");
			int pin = sc.nextInt();
			if(a.getPin() != pin) {
		        throw new Exception("Wrong PIN");
		        
			}
			else {
				System.out.println("Correct PIN,Show Account Details");
			}
		}
		
		
		catch(Exception e) {
			System.out.println("Try again,You have entered wrong pin");
			System.out.println("Enter Retry PIN: ");
			int retrypin = sc.nextInt();
			if(a.getPin() == retrypin) {
				System.out.println("Correct PIN,Show Account Details");
			}
			else {
				System.out.println("Card blocked");
			}
		}
		
		finally {
			System.out.println("Exit");
		}

	}

}
