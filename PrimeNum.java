package practice;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is Not Prime");
        }

        sc.close();
    }
}
//used a boolean flag to track if the number is prime and break the loop once a divisor is found.