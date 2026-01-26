package first;
//DAY 7 ASSIGNMENT1
import java.util.*;
public class practice extends Thread{
	public static void sumOfRange(int start, int end) throws InterruptedException{
		Thread t = new Thread(() ->{
		int sum =0;
		for(int i =start;i<=end;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.print(sum);
	});
		t.start();
		try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
	}
//non editable
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sumOfRange(start,end);
		//non editable	

	}

}
