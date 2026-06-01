import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, reverse = 0, digit;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while(num > 0) {

            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}