package collections;

import java.util.*;
public class List2UseCase230126 {
	public static void main(String[] args) {
		List<String> opd = new LinkedList<>();
		
		opd.add("hema");
		opd.add("malini");
		opd.add("surekha");
		opd.add("lakshmi");
		opd.add("ramu");
		
		int count = 1;
		for(String p: opd) {
			System.out.println(count +": "+ p);
			count++;
		}
		
		System.out.println(" ");
		opd.addLast("ramya");
		int count1 = 1;
		for(String p: opd) {
			System.out.println(count1 +": "+ p);
			count1++;
		}
		
		System.out.println(" ");
		System.out.println("Patient 1 is treated");
		opd.removeFirst();
		int count2 = 1;
		for(String p: opd) {
			System.out.println(count2 +": "+ p);
			count2++;
		}
		
		System.out.println(" ");
		System.out.println("Emergency case!!!! Its Balu");
		opd.addFirst("Balu");
		int count3 = 1;
		for(String p: opd) {
			System.out.println(count3 +": "+ p);
			count3++;
		}
		
		System.out.println(" ");
		System.out.println("To Check Who is first patient: "+ opd.getFirst());
		System.out.println("To Check Who is last patient: "+ opd.getLast());
		
		System.out.println(" ");
		System.out.println("View all the patients: ");
		int count4 = 1;
		for(String p: opd) {
			System.out.println(count4 +": "+ p);
			count4++;
		}
	}

}
