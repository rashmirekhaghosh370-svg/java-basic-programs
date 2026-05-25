import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, square, sum = 0, digit;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        square = num * num;

        while(square > 0) {

            digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if(sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}