import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking even or odd
        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}