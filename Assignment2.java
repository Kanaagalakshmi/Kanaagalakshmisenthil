import java.util.*;
import java.util.Random;
public class Assignment2 implements Runnable{
	Random rand = new Random();
	String[]colors= {"RED","GREEN","BLUE","PINK"};
public void run() {
	int ab = rand.nextInt(4);
	while(true) {
		 ab=rand.nextInt(4); 
		 System.out.println(ab);
		if(ab<4&&colors[ab].equals("RED")) {
			System.out.println("FOUND RED");
			break;
		}	}
	
}
public static void main(String[]args) {
	Assignment2 a=new Assignment2();
	Thread t1=new Thread(a,"Colours");
	//Thread t2=new Thread(a,"Index");
	t1.start();
}
}
