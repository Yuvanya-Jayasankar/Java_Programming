package first;
//USE CASE-1 FROM DAY 2
import java.util.*;

public class EmployeeName {

	public static void main(String[] args) {
		String[] arr = {"Renu Sai", "Akhil Kumar","John Doe","Meera"};
		for(int i=0;i<arr.length;i++) {
			String name = arr[i];
			System.out.print("Employee:"+ name +" -> ");
				if(name.length()> 10) {
					System.out.println("Long Name");
				}
				else if(!name.contains(" ")) {
					System.out.println("Single Word Name");
				}
				else {
					System.out.println("Normal Name");
				}
			System.out.println("UPPER: "+name.toUpperCase());
			StringBuffer rev = new StringBuffer(name).reverse();
			System.out.println("REVERSE: "+ rev);
			StringBuilder app = new StringBuilder(name);
			System.out.println("APPENDED: "+ app.append("--Verified"));
		}
		
	}

}
