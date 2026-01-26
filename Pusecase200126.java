package first;
//USE CASE 1 20/01/26 hierarchical inheritance
class Employeee{
	void type() {
		System.out.println("Choose type of employee: ");
	}
}
class Manager extends Employeee{
	void type() {
		System.out.println("I'm manager");
	}
	
}
class Developer extends Employeee{
	void type() {
		System.out.println("I'm developer");
	}
	
}

public class Pusecase200126 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is written as inheritance with polymorphism means we did overriding
		 Employeee e;
		 e= new Manager();
		 e.type();
		 e= new Developer();
		e.type();
		
		
		
/*now this is written only with inheritance

// Parent class
class Employeee {
    void type() {
        System.out.println("Choose type of employee: ");
    }
}

// Child class Manager with its own method
class Manager extends Employeee {
    void managerMethod() {
        System.out.println("I'm manager");
    }
}

// Child class Developer with its own method
class Developer extends Employeee {
    void developerMethod() {
        System.out.println("I'm developer");
    }
}

public class xyz {
    public static void main(String[] args) {
        // Using child objects directly with child references

        Manager m = new Manager();
        m.type();           // inherited method from Employeee
        m.managerMethod();  // Manager-specific method

        Developer d = new Developer();
        d.type();           // inherited method from Employeee
        d.developerMethod();// Developer-specific method

        // Using parent reference only calls parent methods
        Employeee e = new Employeee();
        e.type();
        // e.managerMethod();   // ❌ Not allowed, compiler error
        // e.developerMethod(); // ❌ Not allowed, compiler error
    }
}

		 */
		
	}
}
