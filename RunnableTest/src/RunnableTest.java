public class RunnableTest {

	public static void main(String[] args) {
		Thread myThread = new Thread(new MyRunnable());
		Thread myOtherThread = new Thread(new MyOtherRunnable());
		
		
		myOtherThread.start();
		
		myThread.start();

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {		
		while(true) {
			System.out.println("A");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}

class MyOtherRunnable implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("B");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
}
