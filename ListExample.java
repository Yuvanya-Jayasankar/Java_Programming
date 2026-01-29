package collections;
import java.util.*;
//ARRAYLIST EXAMPLE

public class ListExample {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	List<String> names=new ArrayList<>();
    	List<String> name=new ArrayList<>();
    	//or u can write this way also
    	//ArrayList<String> names=new ArrayList<>(); 
    	names.add("Yuvi");
    	names.add("Shalu");
    	names.add("Yuvi");
    	
    	name.add("hey");
    	name.add("hi");
    	name.add("hello");
    	System.out.println(names);
    	//DIFFERENT METHODS
    	System.out.println("1 "+names.contains("Hello"));
    	System.out.println("2 "+names.equals("yuvi"));
    	System.out.println("3 "+names.get(1));
    	System.out.println("4 "+names.getFirst());
    	System.out.println("5 "+names.getLast());
    	System.out.println("6 "+names.hashCode());
    	System.out.println("7 "+names.indexOf("Yuvi"));
    	System.out.println("8 "+names.isEmpty());
    	System.out.println(names);
    	System.out.println("9 "+names.lastIndexOf(names));
    	System.out.println("10 "+names.remove(2));
    	System.out.println(names);
    	System.out.println("11 "+names.set(0, "Cutie"));
    	System.out.println(names);
    	System.out.println("12 "+names.size());
    	System.out.println("13 "+names.add("hello"));
    	System.out.println("14 "+names.iterator());
    	System.out.println(names);
    	System.out.println("15 "+names.listIterator());
    	System.out.println("16 "+names.remove(names));
    	System.out.println(names);
    	names.clear();
    	System.out.println("17 "+names);
	}

}
