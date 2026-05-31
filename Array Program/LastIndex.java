public class LastIndex {
    public static void main(String[] args) {

        int arr[] = {1,2,9,3,9,4,9,6,7,8};

        int key = 9;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
            }
        }

        System.out.println("Last index = " + index);
    }
}