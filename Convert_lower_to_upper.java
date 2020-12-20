import java.util.Scanner;

public class Convert_lower_to_upper {

	public static void main(String[] args) {
	char a;
        System.out.println("enter");
	
	Scanner sc=new Scanner(System.in);
	a=sc.nextLine().charAt(0);
	if(a>=64&&a<=90) {
		System.out.println((char)((int)a+32));
	}
else{
System.out.println((char)((int)a-32));
	
}
	}

}
