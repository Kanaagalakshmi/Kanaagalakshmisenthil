
public class IsAlive {
public void run() {
	
}
public static void main(String[]args) {
	ThreadControl t1=new ThreadControl("one");
	ThreadControl t2=new ThreadControl("two");
	ThreadControl t3=new ThreadControl("three");
	System.out.println("Thread 1 is alive?:"+t1.thread.isAlive());
	System.out.println("Thread 2 is alive?:"+t2.thread.isAlive());
	System.out.println("Thread 3 is alive?:"+t3.thread.isAlive());
	try {
		System.out.println("Waiting for the current thread "+Thread.currentThread()+" to finish");
		
		t1.thread.join();
		t2.thread.join();
		t3.thread.join();
		System.out.println("Thread 1 is alive?:"+t1.thread.isAlive());
		System.out.println("Thread 2 is alive?:"+t2.thread.isAlive());
		System.out.println("Thread 3 is alive?:"+t3.thread.isAlive());

	}
	catch(InterruptedException e) {
		System.out.println("Main Thread Interrupted");
	}
}
}
