import java.util.Scanner;

public class Prime1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter N: ");
        n = sc.nextInt();

        for(int num = 1; num <= n; num++) {

            int count = 0;

            for(int i = 1; i <= num; i++) {

                if(num % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(num);
            }
        }
    }
}