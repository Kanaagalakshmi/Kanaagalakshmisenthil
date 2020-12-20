
public class DemoRunnable2 implements Runnable{
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+" Thread is Running "+i);
	}
}
public static void main(String[]args) {
	DemoRunnable2 demo=new DemoRunnable2();
	Thread t1=new Thread(demo,"First");
	Thread t2=new Thread(demo,"Second");
	t2.start();
	t1.start();
}
}
