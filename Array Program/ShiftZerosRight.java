public class ShiftZerosRight {
    public static void main(String[] args) {

        int arr[] = {2,0,5,3,1,0,3,1};

        int temp[] = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                temp[k++] = arr[i];
            }
        }

        while(k < arr.length) {
            temp[k++] = 0;
        }

        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}