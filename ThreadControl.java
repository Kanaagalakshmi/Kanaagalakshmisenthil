
public class ThreadControl implements Runnable{
String name;
Thread thread;
ThreadControl(String tname){
	name=tname;
	thread=new Thread(this,name);
	System.out.println("THREAD:" +thread);
	thread.start();
}
public void run() {
	System.out.println(Thread.currentThread()+"Thread is running");
	try {
		for(int i=5;i>0;i--) {
			System.out.println("Threadname: "+name+" Child Thread:"+i);
			
		}
		thread.sleep(1000);
	}
	catch(InterruptedException e){
		System.out.println("Interrupted "+name);
		
		
	}
	System.out.println("Existing "+name);
}
//public static void main(String[]args) {
	//ThreadControl t=new ThreadControl("soppanasundhari");
//}
}
