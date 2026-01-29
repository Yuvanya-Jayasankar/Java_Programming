package collections;
import java.util.*;

public class SetUseCase230126 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashSet<Integer> patientId=new HashSet<>();
			//HashSet<Integer> patientId=new HashSet();
			//Set<Integer> patientId=new HashSet();
			patientId.add(1);
			patientId.add(2);
			patientId.add(3);
			patientId.add(4);
			patientId.add(5);
		while(true) {
				System.out.print("Enter the Id to search or add: ");
				int temp = sc.nextInt();
				if(patientId.add(temp)) {
					System.out.println("Patient is successfully registered now");
				}else {
					System.out.println("Patient already Registered(Duplicate ID)");
				}
		
			
			System.out.println("total no. of Patients are now: "+ patientId.size());
			System.out.println("List of registered patients:");
			
			for( int patient1:patientId) {
				System.out.println(patient1);
			}
		  }
		}
	}
	 
	
