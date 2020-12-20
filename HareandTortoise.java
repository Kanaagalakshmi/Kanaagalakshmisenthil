
public class HareandTortoise extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(Thread.currentThread().getName().equals("Hare")&&i==60) {
				try{Thread.sleep(1000);}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			if(i==100) {
				System.out.println(Thread.currentThread().getName()+" won the race");
			
			//	
				interrupted();
		}
	}}
public static void main(String[]args) {
	HareandTortoise hare=new HareandTortoise();
	hare.setName("Hare");
	hare.setPriority(MAX_PRIORITY);
	hare.start();
	HareandTortoise tortoise=new HareandTortoise();
	tortoise.setPriority(MIN_PRIORITY);
	tortoise.setName("Tortoise");
	tortoise.start();
	
}
}
