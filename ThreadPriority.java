
public class ThreadPriority implements Runnable {
public void run() {
	try {
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+"'s child thread "+i);
		}
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		System.out.println("Main Thread Is Interrupted");
	}
}
public static void main(String[]args) {
	ThreadPriority tp=new ThreadPriority();
	Thread t1=new Thread(tp,"one");
	Thread t2=new Thread(tp,"two");
	Thread t3=new Thread(tp,"three");
	System.out.println("Thread ONE 'S Priority:"+t1.getPriority());
	System.out.println("Thread TWO 'S Priority:"+t2.getPriority());
	System.out.println("Thread THREE 'S Priority:"+t3.getPriority());
	
t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY+1);
	t3.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
	
}
}
