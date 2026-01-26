package first;

public class MultiThreadingRunnable implements Runnable 
{
	public void run() {
		System.out.println("Thread is running using runnable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MultiThreadingRunnable());
		t.start();
	}
}
