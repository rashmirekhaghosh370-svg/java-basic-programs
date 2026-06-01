import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.next();

        if(num.contains("0") && num.charAt(0) != '0') {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}