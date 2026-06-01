import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, original, sum = 0, digit;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        original = num;

        while(num > 0) {

            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if(original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}