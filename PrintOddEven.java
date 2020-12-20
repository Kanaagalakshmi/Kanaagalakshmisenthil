
public  class PrintOddEven{
static int count=1;

public void odd(){
	synchronized(this){
		while(count<10) {
			while(count%2!=0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				//System.out.println("Interrupted "+Thread.currentThread().getName());
				e.printStackTrace();
			}
		}
		System.out.println(count);
		count++;
		notify();
		
	}}
}
public void even() {
	synchronized(this) {
		while(count<10) {
			while(count%2==0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				//System.out.println("Interrupted "+Thread.currentThread().getName());
			e.printStackTrace();
			}
		}
		System.out.println(count);		
		count++;
		notify();
		}
	}
}
public static void main(String[]args) {
		PrintOddEven poe=new PrintOddEven();
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				poe.odd();
			}
		}
			
		);
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				poe.even();
			}
		});
		t1.start();
		t2.start();
	/**	try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupting thread "+Thread.currentThread().getName());
		}
		*/
	
}
}
