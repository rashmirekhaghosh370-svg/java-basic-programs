<<<<<<< HEAD

import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
=======
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking even or odd
        if(num % 2 == 0) {
>>>>>>> 7174257cde9a038f5ee7da7d9373387dc0b786c3
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
