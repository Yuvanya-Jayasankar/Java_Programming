package first;
//INHERITANCE
class Animal{
	public void Display() {
		System.out.println("I'm parent class");
	}
}

class Dog extends Animal{
	public void Bark() {
		System.out.println("I'm barking");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Bark();
		d.Display();
	}
  }

