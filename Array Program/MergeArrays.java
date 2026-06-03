public class MergeArrays {
    public static void main(String[] args) {

        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};

        int arr3[] = new int[arr1.length + arr2.length];

        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            arr3[k++] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            arr3[k++] = arr2[i];
        }

        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}