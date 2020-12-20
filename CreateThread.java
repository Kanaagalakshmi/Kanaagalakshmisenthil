
public class CreateThread extends Thread{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(i);
		}
	}
public static void main(String[]args) {
	CreateThread c=new CreateThread();
	c.start();
	
}
}
