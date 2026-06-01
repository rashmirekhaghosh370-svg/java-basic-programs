public class ConvertValues {
    public static void main(String[] args) {

        int arr[] = {0,2,-1,0,2,-1,3};

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 0)
                arr[i] = -1;
            else if(arr[i] == -1)
                arr[i] = 0;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}