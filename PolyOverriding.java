package first;
//Method overriding 
//Tip: use Super keyword to get the parent class;

class Parent{
	void display() {
		System.out.println("Hey i m Parent Class");
	}
}

class Child extends Parent{	
 void display() {

// Use of Super    	
 	super.display();
	System.out.println("Hey i m Child Class");
}
}

public class PolyOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1= new Child();
	     c1.display();
	}

}
