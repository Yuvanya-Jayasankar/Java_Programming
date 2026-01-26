package first;
//MULTITHREADING EXAMPLE
public class Multithreading extends Thread {
	public void run()
	{
		System.out.println("Thread is running")	;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading t = new Multithreading();
		t.start();
	}
}
