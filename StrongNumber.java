import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, original, sum = 0, digit, fact;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        original = num;

        while(num > 0) {

            digit = num % 10;

            fact = 1;

            for(int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            num = num / 10;
        }

        if(sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}