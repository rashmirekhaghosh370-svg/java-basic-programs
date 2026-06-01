public class SingleDigitSum {
    public static void main(String[] args) {

        int arr[] = {23,55,57,93,10,1};

        for(int i=0; i<arr.length; i++) {

            int num = arr[i];

            while(num > 9) {

                int sum = 0;

                while(num > 0) {
                    sum += num % 10;
                    num /= 10;
                }

                num = sum;
            }

            System.out.print(num + " ");
        }
    }
}