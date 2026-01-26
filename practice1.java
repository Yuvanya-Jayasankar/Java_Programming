package first;
import java.util.*;
class SumTask implements Runnable {
    int start, end;

    SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}

public class practice1 extends Thread {

    public static void sumOfRange(int start, int end) {
        Thread t = new Thread(new SumTask(start, end));
        t.start();
        
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
//non editable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sumOfRange(start, end);
    }
}
//non editable