package practice;

import java.util.Scanner;

public class GreatestOf3Num {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest number is: "+num1);
		}
		else if(num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        }
        else {
            System.out.println("The greatest number is: " + num3);
        }

        sc.close();
	}

}
//I compared each number with the other two using logical AND (&&) to ensure it is greater than both
