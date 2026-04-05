package practice;
import java.util.Scanner;

public class Datatype {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		
		System.out.println("Enter you year of birth: ");
		int yob=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your email id: ");
		String email=sc.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("Your year of birth = "+yob);
		System.out.println("Your email id is "+email);
		
		
		
		
		
		
	}

}
