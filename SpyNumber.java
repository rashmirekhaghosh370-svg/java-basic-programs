import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, sum = 0, product = 1, digit;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while(num > 0) {

            digit = num % 10;

            sum = sum + digit;
            product = product * digit;

            num = num / 10;
        }

        if(sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}