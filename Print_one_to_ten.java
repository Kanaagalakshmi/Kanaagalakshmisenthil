
public class Print_one_to_ten implements Runnable{
	String name;
	Thread thread;
Print_one_to_ten(String tname){
name=tname;
thread=new Thread(this,name);
thread.start();
}
	public void run() {
		System.out.println(Thread.currentThread()+"Thread is running");
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Threadname: "+name+" Child Thread:"+i);
			if(i==6) {
				thread.sleep(1000);
			}
			}
			
		}
		catch(InterruptedException e){
			System.out.println("Interrupted "+name);
			
			
		}
		System.out.println("Existing "+name);
		System.out.println("isalive? "+thread.isAlive());
		
	}
	public static void main(String[]args) {
		Print_one_to_ten t=new Print_one_to_ten("Print_one_to_ten");
		System.out.println("isalive? "+Thread.currentThread().isAlive());
		
	}
	}

