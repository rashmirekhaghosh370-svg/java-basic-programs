public class AddTwoArrays {
    public static void main(String[] args) {

        int arr1[] = {2,3,4,1};
        int arr2[] = {2,3,5,6,7,8,9};

        int max = Math.max(arr1.length, arr2.length);

        for(int i=0; i<max; i++) {

            int a = (i < arr1.length) ? arr1[i] : 0;
            int b = (i < arr2.length) ? arr2[i] : 0;

            System.out.print((a + b) + " ");
        }
    }
}