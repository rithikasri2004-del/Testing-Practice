package practice;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number to check its palindrome:");
	        int n = sc.nextInt();
	        int original = n;
	        int rev = 0,digit = 0;
	        while (n>0) {
	        	digit = n % 10;
	        	rev = rev * 10 + digit;
	        	n = n/10;
	        	
	        }
	        if(original==rev) {
	        	System.out.println("The number is palindromw: "+rev);
	        }
	        else {
	        System.out.println("The  number is not palindrome: ");
	        }

	}

}
//reverse the number and compare it with the original. If both are equal, it is a palindrome