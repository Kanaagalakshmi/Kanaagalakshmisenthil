
public class ThreadInfo {
public static void main(String[]args) {
Thread t=Thread.currentThread();
System.out.println("Thread name:"+t);
t.setName("NEW THREAD");
System.out.println("Thread new name:"+t);
try {
	Thread.sleep(1000);
}
catch(Exception e) {
	System.out.println("Main Thread Interrupted");
}
}
}
