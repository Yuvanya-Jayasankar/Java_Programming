package first;
//SLEEP METHOD EXAMPLE
class  MutliThreadingSleepMethod extends Thread 
{
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
           
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				} // 1 second
         
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	 MutliThreadingSleepMethod t = new  MutliThreadingSleepMethod();
        t.start();
       for(int i=1;i<=5;i++) {
    	   Thread.sleep(500);
    	   t.interrupt();
       }
       for (int i = 1; i <= 5; i++) {
           Thread.sleep(500);  // wait before interrupting
           t.interrupt();      // interrupt sleeping thread
       }
    }
}

