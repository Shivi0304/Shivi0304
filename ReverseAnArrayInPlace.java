class ReverseArray {

    public int reverse (int[] arr){
        if(arr == null) {
            return -1;
        }
        if(arr.length == 1) {
            return 0;
        }
        int i = 0, j = arr.length - 1;
        while(i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        return 0;
    }

}
public class ReverseAnArrayInPlace {
    public static void main (String args[]) {
        int[] arr = new int[]{4,2,7,9,1,9,24,12,67};
        ReverseArray rev = new ReverseArray();
        int result = rev.reverse(arr);
        if(result == -1) {
            System.out.println("Array is null");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
