import java.util.Arrays;

class BubbleSorting {
    public static void main(String args[])
    {
        int arr[] = {99, 1, 13, 44, 2, 3, 100, 9};
        System.out.println("adw" + Arrays.toString(arr));
        
        for(int i = 1; i < arr.length; i++){
            for(int j = arr.length-1; j >= i; j--){
                System.out.println("adw" + Arrays.toString(arr));
                if(arr[j]<arr[j-1]){
                    int mJ = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = mJ;
                }
            }
        }
        System.out.println("asasa" + Arrays.toString(arr));
    }
}