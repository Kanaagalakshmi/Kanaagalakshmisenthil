
public class Assignment1 extends Thread {
public static void main(String[]args) {
	Assignment1 a=new Assignment1();
/**	Thread t0=Thread.currentThread();
	System.out.println("Thread Name:"+t0);
	t0.setName("MainMethod");
	System.out.println("New Thread Name:"+t0);
	Thread t1=Thread.currentThread();
	System.out.println("Thread Name:"+t1);
	t1.setName("scooby");
	System.out.println("New Thread Name:"+t1);
	Thread t2=Thread.currentThread();
	System.out.println("Thread Name:"+t2);
	t2.setName("shaggy");
	System.out.println("New Thread Name:"+t2);
	*/
	Thread t1=new Thread(a,"scooby");
	Thread t2=new Thread(a,"shaggy");
	System.out.println("Thread Name:"+t1.getName());
	System.out.println("Thread Name:"+t2.getName());
	
}
}
