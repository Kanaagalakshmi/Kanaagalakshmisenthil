
public class DemoRunnable implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
public static void main(String[]args) {
	DemoRunnable demo=new DemoRunnable();
	Thread t=new Thread(demo);
	t.start();
}
}
